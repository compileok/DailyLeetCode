package array;

/**
 * 26. Remove Duplicates from Sorted Array
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * Given nums = [1,1,2],Your function should return length = 2 ,with the first two elements of nums being 1 and 2 respectively.
 * Given nums = [0,0,1,1,1,2,2,3,3,4],Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, 4
 * @author xudeming
 * @date 2019/3/22
 */
public class RemoveDuplicates {

	/**
	 * Runtime: 5 ms, faster than 99.86% of Java online submissions for Remove Duplicates from Sorted Array.
	 */
	public static int removeDuplicates(int[] nums) {
		int res = 1;
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] != nums[i+1]){
				nums[res]=nums[i+1];
				res ++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[]{1}));
		System.out.println(removeDuplicates(new int[]{1,1}));
		System.out.println(removeDuplicates(new int[]{1,1,2}));
		System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
	}

}
