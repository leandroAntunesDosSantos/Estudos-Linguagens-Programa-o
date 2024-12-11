public class QuickSort {

    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length -1);
    }

    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr,low,pivotIndex -1);
            quickSort(arr,pivotIndex +1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++){
            if (arr[j] <= pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr, String titulo){
        System.out.println(titulo);
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90,34,2,1};

        printArray(arr, "Array não ordenado:");

        quickSort(arr);

        printArray(arr, "Array ordenado: ");
    }
}
