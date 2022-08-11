package Arrays;

public class SelectionSort {
    public void implementation (int[] int_array) {

        int unsorted_partition_index = int_array.length - 1;
        while (unsorted_partition_index != 1) {
            int largest_index = 0;

            for (int i = 1; i <= unsorted_partition_index; i++) {
                if (int_array[i] > int_array[largest_index]) {
                    largest_index = i;
                }
            }

            swap(int_array, largest_index, unsorted_partition_index);
            unsorted_partition_index--;
        }

        // print the sorted array
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
