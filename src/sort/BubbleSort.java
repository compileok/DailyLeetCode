package sort;

public class BubbleSort {


    public static void main(String[] args) {

        int[] notSortEdArray = new int[] {2,5,1,9,4,7,3,12,8,17,23,21};

        execute(notSortEdArray);

        for (int i = 0; i < notSortEdArray.length; i++) {
            System.out.println(notSortEdArray[i]);
        }
    }


    public static void execute(int[] array){

        if(array == null) {
            return ;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -1; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}
