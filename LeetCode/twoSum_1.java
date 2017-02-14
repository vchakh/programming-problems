	//1. Two Sum
	//Given an array of integers, return indices of the two numbers such that they add up to a specific target
	// https://leetcode.com/problems/two-sum/
	//Input: int[] nums = {2, 7, 11, 15, 3, 6, 7}; int target = 9;
	//Output: i=0 j=1; i=0 j=6; i=4 j=5  9==(2+7; 2+7; 3+6)
	//public static void two_sum() {
	public static int[] twoSum_1(int[] nums, int target) {
		List<Integer> intList = new ArrayList<Integer>();
		
		for (int i=0; i<nums.length; ++i){
			for (int j=i+1; j<nums.length; ++j){
				if (nums[i]+nums[j] == target){
					//System.out.println("i="+i+" j="+j);
					intList.add(i);
					intList.add(j);
				}
			}
		}
		
		//Convert List<Integer> to int[]
		int[] primitives = new int[intList.size()]; 
	    ListIterator iter = intList.listIterator();
	    for(int i=0; iter.hasNext(); i++){
	    	//System.out.println(iter.next());
	    	primitives[i] = (int) iter.next();
	    }  	
		
		System.out.println(Arrays.toString(primitives));
		return primitives;  
	}
