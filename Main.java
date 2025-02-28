import java.util.Scanner;
import algorithms.*;

public class Main {
    @SuppressWarnings("unused")
    private static void binarySearchExecutor() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Realizando uma busca binária em um array de 0 a 100.");
        System.out.println("Insira o número a ser encontrado: ");
        int target = scanner.nextInt();
        int index = BinarySearch.binarySearch(arr, target);
        System.out.printf("The position of %d is %d", target, index);
        System.out.println();
        scanner.close();
    }

    public static void main(String[] args) {
        binarySearchExecutor();
    }
}
