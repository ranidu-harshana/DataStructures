package Arrays;

public class BubbleSort {
    public void implementation (int[] int_array) {
        int unsorted_partition_index = int_array.length - 1;
        while (unsorted_partition_index != 0) {
            for (int i = 0; i <= unsorted_partition_index-1; i++) {
                int midd;
                if (int_array[i] > int_array[i+1]) {
                    swap(int_array, i, i+1);
                }
            }
            unsorted_partition_index--;
        }

        for (int j : int_array) {
            System.out.println(j);
        }
    }

    public void swap (int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
