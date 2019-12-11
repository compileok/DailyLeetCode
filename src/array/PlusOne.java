package array;


/**
 * num 66
 *
 * Success
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
 * Memory Usage: 35.3 MB, less than 97.58% of Java online submissions for Plus One.
 */
public class PlusOne {


    public int[] plusOne(int[] digits) {

        if(digits == null){
            return null;
        }

        int num = 1;
        for (int i = digits.length-1; i >=0 ; i--) {
            if(num == 1){
                digits[i] += 1;
                if(digits[i] > 9){
                    num = 1;
                }else{
                    num = 0;
                    break;
                }
            }
            digits[i] = digits[i] % 10;
        }
        if(num == 1){
            int [] res = new int[digits.length+1];
            System.arraycopy(digits,0,res,1,digits.length);
            res[0]=1;
            return res;
        }
        return digits;
    }

    public static void main(String[] args) {
        PlusOne p = new PlusOne();

        int[] array1 = {9,9,9};
        int[] array2 = {4,3,2,1};
        int[] res1 = p.plusOne(array1);
        int[] res2 = p.plusOne(array2);

        printArray(res1);
        printArray(res2);
    }


    public static void printArray(int[] element){
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i]+",");
        }
        System.out.println();
    }

}
