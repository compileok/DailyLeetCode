package array;

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
	public static int removeElement(int[] nums, int val) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != val){
				nums[res++] = nums[i];
			}else {
				nums[i]=0;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr1 = new int[]{3,2,2,3};
		int num1 = 3;
		System.out.println(removeElement(arr1,num1));

		int[] arr2 = new int[]{0,1,2,2,3,0,4,2};
		int num2 = 2;
		System.out.println(" arr2 test--->"+removeElement(arr2,num2));
		for (int i = 0; i <arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
