public class BinarySearch {
    int[] ages = {13, 31, 35, 39, 41, 61, 90};
    int target;

    public static int binarySearch(int[] ages, int target) {
        int low = 0;
        int high = ages.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (ages[mid] == target) {
                return mid;
            } else if (ages[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
