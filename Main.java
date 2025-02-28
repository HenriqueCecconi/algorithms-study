import java.util.Scanner;
import algorithms.*;

import java.util.Arrays;
import java.util.Random;

public class Main {
    // Auxiliary method for creating random arrays of integers
    public static int[] randomArray() {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    @SuppressWarnings("unused")
    private static void binarySearchExecutor() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Realizing a binary search on an array from 0 to 100.");
        System.out.println("Input the number to be found: ");
        int target = scanner.nextInt();
        int index = BinarySearch.binarySearch(array, target);
        System.out.printf("The position of %d is %d", target, index);
        System.out.println();
        scanner.close();
    }

    @SuppressWarnings("unused")
    private static void selectionSortExecutor() {
        int[] array = randomArray();
        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(array));

        SelectionSort.selectionSort(array);

        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        // binarySearchExecutor();
        // selectionSortExecutor();
    }
}
