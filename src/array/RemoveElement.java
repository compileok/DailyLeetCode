package array;

import java.util.Arrays;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * Given nums = [3,2,2,3], val = 3,Your function should return length = 2, with the first two elements of nums being 2.
 * Given nums = [0,1,2,2,3,0,4,2], val = 2,Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, 4.
 * It doesn't matter what values are set beyond the returned length.
 * @author xudeming
 * @date 2019/3/22
 */
public class RemoveElement {

	/**
	 * Runtime: 3 ms, faster than 100.00% of Java online submissions for Remove Element.
	 */
	private static int removeElement(int[] nums, int val) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == val){
				nums[i] = 0;
			}else {
				nums[res++] = nums[i];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int num1 = 3;
		int[] arr1 = new int[]{3,2,2,3};
		int[] expect1 = new int[]{2,2};
		int res1 = removeElement(arr1,num1);
		boolean flag1 = Arrays.equals(Arrays.stream(arr1).limit(res1).toArray(),expect1);
		System.out.println("falg1:" + flag1);


		int num2 = 2;
		int[] arr2 = new int[]{0,1,2,2,3,0,4,2};
		int[] expect2 = new int[]{0, 1, 3, 0, 4};
		int res2 = removeElement(arr2,num2);
		boolean flag2 = Arrays.equals(Arrays.stream(arr2).limit(res2).toArray(),expect2);
		System.out.println("flag2:" + flag2);
	}

}
