import java.util.Arrays;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexSmallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (indexSmallest > array[i]) {
                indexSmallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex;
        int smallest = array[index];

        for(int i = startIndex; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void sort(int [] array) {
        int index = 0;
        System.out.println(Arrays.toString(array));

        while (index < array.length) {

            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));

            index += 1;
        }

    }

}
