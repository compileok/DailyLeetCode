package sort;

public class InsertionSort {


    public static void main(String[] args) {
        int[] array = new int[]{3,1,5,10,8,2,9,6,15,13,4};
        //execute0(array);

        execute1(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void execute1(int[] array){
        if(array == null) {
            return ;
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j >0; j--) {
                if(array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        
    }
    
    
    public static void execute0(int[] array){
        if(array == null) {
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int insertVal = array[i];
            int index = i - 1;

            while (index >= 0 && insertVal < array[index]) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = insertVal;
        }    
    }

}
