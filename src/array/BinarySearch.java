package array;

public class BinarySearch {


    public static int execute(int[] array, int target){
        if(array == null) {
            return -1;
        }

        int start = 0;
        int end = array.length - 1;

        int middle;
        while (start <= end) {
            middle = (start + end) / 2;

            if(target == array[middle]) {
                return middle;
            }else if(target > array[middle]){
                start = middle + 1;
            }else {
                end = middle -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = new int[]{1,3,4,5,7,8,9,10,12,13,15,17};
        System.out.println( 8 == execute(sortedArray,12));
        System.out.println(2 == execute(sortedArray,4));
        System.out.println(-1 == execute(sortedArray,2));
    }


}
