	//438. Find All Anagrams in a String
	//Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
	// https://leetcode.com/problems/find-all-anagrams-in-a-string/
	//Input: s: "cbaebabacd" p: "abc"
	//Output: [0, 6]
	//Explanation:
	//   The substring with start index = 0 is "cba", which is an anagram of "abc".
	//   The substring with start index = 6 is "bac", which is an anagram of "abc".
	public static List<Integer> findAnagrams_438(String s, String p) {
		List<Integer> ls = new ArrayList<Integer>();
		if(s.equals(p)){
			ls.add(new Integer(1));
			return ls; 
		} else if(p.length()>s.length()){
			//ls.add(0);
			return ls;			
		}
			
		int num = p.length();
		
		//Sort target string
		String[] arr_target = p.split("");
		Arrays.sort(arr_target);
		String sorted_target = "";
		for (int i=0; i<arr_target.length; ++i){
			sorted_target +=arr_target[i];
		}
		System.out.println("sorted: "+sorted_target);
		
		for (int i=0; i<=(s.length()-num); ++i){
			String sub = s.substring(i, i+num);
			//System.out.println("i="+i+" num="+num +"   sub="+sub); 
			
			//Sort input string
			String[] arr = sub.split("");
			Arrays.sort(arr);
			String sorted = "";
			for (int j=0; j<arr.length; ++j){
				sorted +=arr[j];
			}
			//System.out.println("sorted =" +sorted);
			if(sorted_target.equals(sorted)){
				System.out.println(" xyi = "+i);
				ls.add(new Integer(i));
			}
		}
		
		System.out.println("FINAL !!!!");
		Iterator iter = ls.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next()+",");
		}
		return ls;
	}
