// Bubble Sort Implementation in Java
import java.util.Arrays;

class BubbleSort {
    // Method to perform bubble sort
    static void bubbleSort(int array[]) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                // Compare adjacent elements and swap if they are in the wrong order
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Main method to test the bubble sort
    public static void main(String args[]) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(data);
        System.out.println("Sorted Array: " + Arrays.toString(data));
    }
}
