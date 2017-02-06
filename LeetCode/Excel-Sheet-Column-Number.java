     //171. Excel Sheet Column Number
     //Given a column title as appear in an Excel sheet, return its corresponding column number.
     // https://leetcode.com/problems/excel-sheet-column-number/
     //Solution: http://codereview.stackexchange.com/questions/44545/excel-column-string-to-row-number-and-vice-versa
     //Output: A->1; B->2; C->3;...Z->26; AA->27; AB->28; AAA->703
public class Solution {
    public int titleToNumber(String s) {
        String column = s;
		int result = 0;
		
		//Note: 'A'=65; 'Z'=90; ('Z'-'A') = 25;
		for (int i = 0; i<column.length(); ++i){
			result *=26;
			result +=column.charAt(i) - 'A' + 1;
		}
		
		System.out.println("column="+column+"; result="+result);
		return result;
    }
}

