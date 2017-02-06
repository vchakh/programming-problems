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

