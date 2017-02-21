	//168. Excel Sheet Column Title
	//Given a positive integer, return its corresponding column title as appear in an Excel shee
	// https://leetcode.com/problems/excel-sheet-column-title/
	//Solution: http://codereview.stackexchange.com/questions/44545/excel-column-string-to-row-number-and-vice-versa
	//Output: 1->A; 2->B; 3->C...26->Z; 27->AA; 28->AB; 703->AAA
	//GitHub: Excel-Sheet-Column-Title-168-2.java; String getExcelColumnName_168_2(int n): Use Character.toString(schar.charAt(i))
  public static String getExcelColumnName_168_2(int n){
		int num = n - 1;
		String schar = "";
		String revers = "";
		
		//Get column name from last column
		//Note: 'A'=65; 'Z'=90; ('Z'-'A') = 25; 
		while (num >= 0){
			int numChar = (num % 26) + 65;
			schar += Character.toString((char)numChar);
			num = (num / 26) - 1;
		}
		System.out.println ("schar.length()="+schar.length()+"; schar="+schar);
		
		//Reverse backward column name 
		for (int i=schar.length()-1; i>=0; --i){
			revers +=Character.toString(schar.charAt(i));
		}
		System.out.println ("number="+n+"; ColumnName="+revers);
		
		return revers;
	}
