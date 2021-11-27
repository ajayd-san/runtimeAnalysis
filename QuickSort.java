import java.util.Random;

public class QuickSort{

    private static Random randomGen = new Random();
    private static void swap(Integer[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(Integer[] arr, int start, int end){
        int pivotIndex = randomGen.nextInt(start, end);
        swap(arr, pivotIndex, end);
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; ++j){
            if (arr[j] < pivot) {
                ++i;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, end);

        return i + 1;
    }
    private static void quicksrt(Integer[] arr, int start, int end){
        if (start >= end) return;
        int pivotIndex = partition(arr, start, end);

        quicksrt(arr, start, pivotIndex - 1);
        quicksrt(arr, pivotIndex + 1, end);
    }

    public static void quicksrt(Integer[] arr){
        quicksrt(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        RandomGen rg = new RandomGen();
        Integer[] random_list = rg.get_random(20000);
        long startTime = System.nanoTime();
        quicksrt(random_list);
        long endTime = System.nanoTime();

        System.out.println("time taken is " + (endTime - startTime)/1000000);
        System.out.println();
        // for (int r : random_list) System.out.print(r + " ");
    }
}
