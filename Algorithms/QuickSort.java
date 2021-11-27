package Algorithms;
import java.util.Random;

public class QuickSort{

    private static Random randomGen = new Random();
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int start, int end){
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
    private static void quicksrt(int[] arr, int start, int end){
        if (start >= end) return;
        int pivotIndex = partition(arr, start, end);

        quicksrt(arr, start, pivotIndex - 1);
        quicksrt(arr, pivotIndex + 1, end);
    }

    public static int[] quicksrt(int[] arr){
        quicksrt(arr, 0, arr.length - 1);
        return arr;
    }
}
