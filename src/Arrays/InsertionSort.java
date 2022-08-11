package Arrays;

public class InsertionSort {
    public void implementation (int[] int_array) {
        int unsorted_index = 1;

        for (int i = unsorted_index; i < int_array.length; i++) {
            int new_element = int_array[i];
            for (int j = i-1; j >= 0; j--) {
//                System.out.println(new_element + "  " + i + "  " + j);
                if (new_element >= int_array[j]) {
                    int_array[j+1] = new_element;
                    break;
                } else {
                    int_array[j+1] = int_array[j];
                }

                if (j == 0) {
                    int_array[0] = new_element;
                }
            }

        }
        for (int n : int_array) {
            System.out.println(n);
        }
    }

    public void swap (int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
