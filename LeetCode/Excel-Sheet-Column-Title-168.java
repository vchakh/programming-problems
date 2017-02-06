	//168. Excel Sheet Column Title
	//Given a column title as appear in an Excel sheet, return its corresponding column number.
	// https://leetcode.com/problems/excel-sheet-column-title/
	//Solution: http://codereview.stackexchange.com/questions/44545/excel-column-string-to-row-number-and-vice-versa
	//Output: 1->A; 2->B; 3->C...26->Z; 27->AA; 28->AB; 703->AAA
public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
		int num = n - 1;
		
		//Note: 'A'=65; 'Z'=90; ('Z'-'A') = 25; 
		while (num >= 0){
			int numChar = (num % 26) + 65;
			sb.append((char)numChar);
			num = (num / 26) - 1;
		}
		
		System.out.println ("number="+n+"; ColumnName="+sb.reverse().toString());
		return sb.reverse().toString();
    }
}
