	//Given an input string, reverse the string word by word.
	//https://leetcode.com/problems/reverse-words-in-a-string/
	//Input string: "Write a program to reverse the words, in this sentence"
	//Output: sentence this in words, the reverse to program a Write
	//Input: "   a   "; Output: "a"
	//Input: "   a   bb"; Output: "bb a"
	//Input: "   a   b  c d   e  "; Output: "e d c b a"
	public static String reverse_words_in_sentence_151(String s) {
		String str = s; //"Write a program to reverse the words, in this sentence";
		String reverse = "";
		List<String> ls_whithout_space = new ArrayList<String>();
		
		if (str == ""){
			System.out.println(reverse+"reverse");
			return reverse;
		}
		
		String [] ar = str.split(" ");
		System.out.println("============ ar.length: "+ar.length+"; Input str=***"+str+"***END"); 
		for (int i=0; i<ar.length; ++i){
			//System.out.println(" === i="+i+"; ar[i]="+ar[i]+"***END");			
		}
		
		for (int i=ar.length-1; i>=0; --i){
			System.out.println(" +++ i="+i+"; ar[i]="+ar[i]+"***END");
			
			if (!"".equals(ar[i])){  
				ls_whithout_space.add(ar[i]);
				//System.out.println(" +++ i="+i+"; ar[i]="+ar[i]+"***END");
			}
		}
		
		ListIterator<String> itr = ls_whithout_space.listIterator();
		int list_count = ls_whithout_space.size();
		//System.out.println("+++ ls_whithout_space.size()="+ls_whithout_space.size()+"+++");
		while(itr.hasNext() && c > 0){
			reverse +=itr.next();
			System.out.println("+++"+reverse+"+++");
			--list_count;
			
			if(list_count>0){
				reverse +=" ";
			}
		}
		System.out.println(reverse+"***reverse");
		System.out.println("reverse.length(): "+reverse.length());
		
    return reverse;
	}
