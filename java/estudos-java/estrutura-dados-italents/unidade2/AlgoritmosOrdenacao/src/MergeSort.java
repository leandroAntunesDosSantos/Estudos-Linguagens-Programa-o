public class MergeSort {

    public static void mergeSort(int[] arr){
        int tamanho = arr.length;
        if (tamanho < 2){
            return;
        }

        int meio = tamanho / 2;
        int[] left = new int[meio];
        int[] right = new int[tamanho - meio];

        System.arraycopy(arr,0,left,0,meio);
        System.arraycopy(arr, meio, right,0,tamanho - meio);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr){
        int tamanhoLeft = left.length;
        int tamanhoRight = right.length;
        int i=0, j=0, k=0;

        while (i < tamanhoLeft && j < tamanhoRight){
            if (left[i] <= right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }

        while (i < tamanhoLeft){
            arr[k++] = left[i++];
        }

        while (j < tamanhoRight){
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90,34,2,1};

        System.out.println("Array não ordenado:");
        for (int i : arr){
            System.out.print(i + " ");
        }

        mergeSort(arr);
        System.out.println(" ");
        System.out.println("Array ordenado: ");
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
