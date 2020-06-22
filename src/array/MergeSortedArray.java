package array;



import java.util.Arrays;

/**
 * num 88
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 *
 *
 *
 *
 *
 *
 */
public class MergeSortedArray {


    /**
     * Success
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
     * Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Merge Sorted Array.
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        while( m > 0 && n > 0) {
            if(nums1[m-1] >= nums2[n-1]) {
                nums1[m+n-1] = nums1[m-1];
                m = m -1;
            } else {
                nums1[m+n-1] = nums2[n-1];
                n = n-1;
            }
        }
        if(n > 0) {
            System.arraycopy(nums2,0,nums1,0,n);
        }
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {



    }


    public static void main(String[] args) {
        test2();

    }

    public static void test0(){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int[] res = {1,2,3,4,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.equals(nums1,res));
    }

    public static void test1(){
        int[] nums1 = {4,5,7,0,0,0};
        int[] nums2 = {1,2,3};
        merge(nums1,3,nums2,3);
        int[] res = {1,2,3,4,5,7};
        System.out.println(Arrays.equals(nums1,res));

    }
    public static void test2(){
        int[] nums1 = {4,0,0,0,0,0};
        int[] nums2 = {1,2,3,5,6};
        merge(nums1,1,nums2,5);
        int[] res = {1,2,3,4,5,6};
        print(nums1);
        System.out.println(Arrays.equals(nums1,res));
    }


    public static void print(int[] array){
        if(array == null) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
