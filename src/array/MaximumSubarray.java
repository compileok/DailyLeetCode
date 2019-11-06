package array;

/**
 *	Given an integer array nums, find the contiguous subarray (containing at least one number)
 *	which has the largest sum and return its sum.
 *
 *   Example:
 *   	Input: [-2,1,-3,4,-1,2,1,-5,4],
 * 		Output: 6
 * 		Explanation: [4,-1,2,1] has the largest sum = 6.
 * @author xudeming
 * @date 2019/3/22
 */
public class MaximumSubarray {

	public int maxSubArray(int[] nums) {
		int res = Integer.MIN_VALUE;
		int sum = 0;
		for(int n : nums){
			sum = Math.max(sum+n,n);// 如果当前的“和”，小于 n,那么抛弃之前的，从 n 这一位算起，重新往后求和。
			res = Math.max(res,sum);// 新求的“和”没有原来的大，那么还用上一阶段最大的和。
		}
		return res;
	}


	public static void main(String[] args) {
		int [] array = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		MaximumSubarray test = new MaximumSubarray();
		int res = test.maxSubArray(array);
		assert res == 6;
	}

}
