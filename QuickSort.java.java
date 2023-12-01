import java.util.Arrays;

class QuickSort {
    public static void main(String[] args) {
        int[] array = {2 ,0 ,2 ,1 ,1 ,0};

        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) return;

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];

        int i = start; int j = start;

        while (i <= end) {
            if (array[i] > pivot) i++;
            else {
                swap(array, i, j);
                i++;
                j++;
            }
            
        }

        return j - 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}