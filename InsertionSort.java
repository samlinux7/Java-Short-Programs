import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {6, 4, 3, 2, 1};

        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];

            int j = i - 1;
            while (j >= 0 && value < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = value;
        }
    }
}
