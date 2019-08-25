package test_simple;

import java.util.UUID;

public class MakeToken {

	public static void main(String[] args) {
		System.out.println(UUID.randomUUID());
		System.out.println(UUID.randomUUID());
		
		int[] nums = {0,0,0,0,1,1,1,2,2,3,3,4};
		Solution s = new Solution();
		int len = s.removeDuplicates(nums);
		for(int i = 0; i < len; i++){
			System.out.print(nums[i]+", ");
		}
	}

}
class Solution {
	public int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
}