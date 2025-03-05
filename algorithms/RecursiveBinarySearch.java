package algorithms;

public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] array, int target, int low, int high) {
        if (array.length == 0 || low > high)
            return -1;

        int mid = (low + high) / 2;
        if (array[mid] == target)
            return mid;

        if (array[mid] > target) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
        return recursiveBinarySearch(array, target, low, high);
    }
}
