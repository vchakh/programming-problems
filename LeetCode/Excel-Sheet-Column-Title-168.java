	//168. Excel Sheet Column Title
	//Given a positive integer, return its corresponding column title as appear in an Excel sheet
	// https://leetcode.com/problems/excel-sheet-column-title/
	//Solution: http://codereview.stackexchange.com/questions/44545/excel-column-string-to-row-number-and-vice-versa
	//Output: 1->A; 2->B; 3->C...26->Z; 27->AA; 28->AB; 703->AAA
	//GitHub: Excel-Sheet-Column-Title-168.java; String getExcelColumnName_168_1(int n): Use StringBuilder reverse().toString()
	public static String getExcelColumnName_168_1(int n){
		StringBuilder sb = new StringBuilder();
		int num = n - 1;
		
		//Get column name from last column
		//Note: 'A'=65; 'Z'=90; ('Z'-'A') = 25; 
		while (num >= 0){
			int numChar = (num % 26) + 65;
			sb.append((char)numChar);
			num = (num / 26) - 1;
		}
		System.out.println ("Backward column name. number="+n+"; ColumnName="+sb.toString()); //Example: input=28; output: BA
		
		//Reverse backward column name. //Example: input=28; output: AB 
		System.out.println ("Revers backward column name; number="+n+"; ColumnName="+sb.reverse().toString()); 
		
		return sb.reverse().toString();
	}
