package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Example ：
 *  Given nums = [2, 7, 11, 15], target = 9,
 *  Because nums[0] + nums[1] = 2 + 7 = 9,
 *  return [0, 1].
 * @author xudeming
 * @date 2019/3/21
 */
public class TwoSum {

	/**
	 * Runtime: 28 ms, faster than 25.08% of Java online submissions for Two Sum.
	 * Memory Usage:  N/A.
	 */
	public int[] twoSum0(int[] nums, int target) {
		if(nums == null ){
			return null;
		}
		for(int i =0; i <nums.length; i++){
			for(int j = i+1;j<nums.length;j++){
				if(nums[i]+nums[j] == target){
					return new int[]{i,j};
				}
			}
		}
		return null;
	}

	/**
	 * Runtime: 3 ms, faster than 99.31% of Java online submissions for Two Sum.
	 * Memory Usage: 38.9 MB, less than 31.85% of Java online submissions for Two Sum.
	 */
	public static int[] towSum1(int[] nums,int target) {
		int[] res = new int[2];
		Map<Integer,Integer> map = new HashMap<>((int)Math.rint(nums.length/0.75)+1);
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				res[0] = map.get(target - nums[i]);
				res[1] = i;
				return res;
			}
			map.put(nums[i],i);
		}
		return res;
	}

	public static void main(String[] args) {
		//int[] res = towSum1(new int[]{12, 6,3, 11,7, 15},9);
		int[] res = towSum1(new int[]{0,4,3,0},0);
		System.out.println(res[0]+"|"+res[1]);

	}


}
