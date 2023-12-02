public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        // swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;

    }

    public static void quocksort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quocksort(arr, low, pi - 1);
            quocksort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 4, 5, 9, 8 };
        int n = arr.length;
        quocksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
