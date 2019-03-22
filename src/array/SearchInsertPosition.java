package array;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 *
 * 	Example 1:
 * 		Input: [1,3,5,6], 5
 * 		Output: 2
 * 	Example 2:
 * 		Input: [1,3,5,6], 2
 * 		Output: 1
 * @author xudeming
 * @date 2019/3/22
 */
public class SearchInsertPosition {

	/**
	 * Runtime: 2 ms, faster than 100.00% of Java online submissions for Search Insert Position.
	 */
	private static int searchInsert(int[] nums, int target) {
		if(nums[0] > target) {
			return 0;
		}
		if(nums[nums.length - 1] < target ) {
			return nums.length;
		}
		int point = -1 ;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] >= target) {
				point =  i;
				break;
			}
		}
		return point;
	}

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[]{1,3,5,6},5) == 2);
		System.out.println(searchInsert(new int[]{1,3,5,6},2) == 1);
		System.out.println(searchInsert(new int[]{1,3,5,6},7) == 4);
		System.out.println(searchInsert(new int[]{1,3,5,6},0) == 0);
	}


}
