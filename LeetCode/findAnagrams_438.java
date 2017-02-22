	//438. Find All Anagrams in a String
	//Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
	// https://leetcode.com/problems/find-all-anagrams-in-a-string/
	//Input: s: "cbaebabacd" p: "abc"; ("abab", "ab");("cbaebabacd", "abc");("af","be");("cbaebabacd", "abc")
	//Output: [0, 6]
	//Explanation:
	//   The substring with start index = 0 is "cba", which is an anagram of "abc".
	//   The substring with start index = 6 is "bac", which is an anagram of "abc".
	public static List<Integer> findAnagrams_438(String s, String p) {
		List<Integer> ls = new ArrayList<Integer>();
		System.out.println("Input string s="+s+"; search input target substring p="+p);
		
		if(s.equals(p)){
			ls.add(new Integer(1));
			return ls; 
		} else if(p.length()>s.length()){
			return ls;			
		} 
		
		//Sort input target substring
		char[] arr_target = p.toCharArray();
		Arrays.sort(arr_target);
		int num = p.length();
		
		//Find search occurrence in input string 
		for (int i=0; i<=(s.length()-num); ++i){
			String sub = s.substring(i, i+num);
			char[] arr_sub = sub.toCharArray();
			Arrays.sort(arr_sub);
			
			if (Arrays.equals(arr_target, arr_sub)){
				ls.add(new Integer(i));
				System.out.println("Index matched i="+i);
			}	
		}

		System.out.println("FINAL !!!!");
		Iterator<Integer> iter = ls.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next()+",");
		}

		return ls;
	}
