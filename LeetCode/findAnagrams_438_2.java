	//438. Find All Anagrams in a String using Hashtable
	//Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
	// https://leetcode.com/problems/find-all-anagrams-in-a-string/
	//Input: s: "cbaebabacd" p: "abc"; ("abab", "ab");("af","be");
	//Output: [0, 6]
	//Explanation: ("cbaebabacd", "abc")
	//  The substring with start index = 0 is "cba", which is an anagram of "abc".
	//  The substring with start index = 6 is "bac", which is an anagram of "abc".
	public static List<Integer> findAnagrams_438_2(String s, String p) {
		List<Integer> ls = new ArrayList<Integer>();
		System.out.println("Input string s="+s+"; search input target substring p="+p);
		
		if(s.equals(p)){
			ls.add(new Integer(1));
			return ls; 
		} else if(p.length()>s.length()){
			return ls;			
		} 
		
		Hashtable<Integer, Character> ht = new Hashtable<Integer, Character>();
		Hashtable<Integer, Character> ht_target = new Hashtable<Integer, Character>();
		Hashtable<Integer, Character> ht_target_clone = new Hashtable<Integer, Character>();
		
		//Add input target substring to Hashtable
		char[] arr_target = p.toCharArray();
		int num = p.length();
		for (int i=0; i<num; ++i){
			ht_target.put(i, arr_target[i]);
		}
		
		//Find search occurrence in input string 
		for (int i=0; i<=(s.length()-num); ++i){
			String sub = s.substring(i, i+num);
			System.out.println("Loop main i="+i+"; sub="+sub);
			char[] arr_sub = sub.toCharArray();
			
			ht_target_clone = (Hashtable)ht_target.clone();
			System.out.println("--***Loop main ht_target_clone.toString() "+ht_target_clone.toString());
		
			for (int j=0; j<sub.length(); ++j){
				System.out.println("--Loop-2 j="+j+"; arr_sub[j]="+arr_sub[j]);
				ht.put(j, arr_sub[j]);
				
				for (int c=0; c<num; ++c){
					System.out.println("--Loop-3 ht.toString() "+ht.toString());
					if(ht.containsValue(arr_target[c])){
						System.out.println("--Loop-3 j="+j+"; arr_sub[j]="+arr_sub[j]+"; c="+c+"; arr_target[c]="+arr_target[c]);
						ht.values().remove(arr_target[c]);
						ht_target_clone.values().remove(arr_target[c]);
						System.out.println("--***Loop-3 ht.toString() "+ht.toString());
						System.out.println("--***Loop-3 ht_target_clone.toString() "+ht_target_clone.toString());
					}
				}
			}
			if(ht.isEmpty() && ht_target_clone.isEmpty()){
				ls.add(new Integer(i));
				System.out.println("Index matched i="+i);
			}
			ht.clear();
		}

		System.out.println("FINAL !!!!");
		Iterator<Integer> iter = ls.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next()+",");
		}

		return ls;
	}
