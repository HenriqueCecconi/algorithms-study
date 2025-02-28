package algorithms;

public class BinarySearch {
    /**
     * Finds the index at which the target number is located in the array
     * This algorithm has time complexity O(log N) and space complexity O(1)
     * 
     * @param array  an ordered array if integers
     * @param target number to be found in array
     * @return index at which target is located in array
     */
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}