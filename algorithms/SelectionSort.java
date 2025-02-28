package algorithms;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        if (array.length == 0)
            return;

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] <= array[minIndex]) {
                    minIndex = j;
                }
            }
            int auxiliaryInt = array[i];
            array[i] = array[minIndex];
            array[minIndex] = auxiliaryInt;
        }
        return;
    }
}
