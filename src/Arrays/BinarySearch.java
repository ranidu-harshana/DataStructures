package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {6, 13, 14, 25, 33, 43, 51, 53, 94, 72};
        int keyElement = 43;
        int lo = 0;
        int hi = array.length - 1;
        int index = binarySearch(array, keyElement, lo, hi);
        if (index == -1) System.out.println("Element is not found!");
        else System.out.println("Element is found at index: " + index);
    }

    public static int binarySearch(int arr[], int keyElement, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = (lo + hi) / 2;

        if (arr[mid] == keyElement) return mid;
        else if (arr[mid] > keyElement) return binarySearch(arr, keyElement, lo, mid - 1);
        else return binarySearch(arr, keyElement, mid + 1, hi);
    }
}
