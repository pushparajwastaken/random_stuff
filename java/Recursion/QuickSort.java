public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {22,31,2,36,87,65,321,12,43};
        QS(arr, 0, arr.length - 1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }

    public static void QS(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // Recursively sort two halves
        QS(arr, low, e);
        QS(arr, s, high);
    }
}