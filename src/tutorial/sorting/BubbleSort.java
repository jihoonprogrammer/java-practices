package tutorial.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] array = {3,11,2,9,1,5};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] bubbleSort(int[] array){
        for (int i=0; i<array.length; i++){
            for (int j=i; j<array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
