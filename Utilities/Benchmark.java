package Utilities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import Algorithms.BinaryTree;
import Algorithms.QuickSort;

public class Benchmark {
    public static void BenchmarkAll(int size){

        int[] arr = new RandomGen().get_random(size);
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Map<String, Long> timeRecords = new HashMap<>();

        System.out.printf("Benchmark for %d elements\n-------------------------------\n", size);

        long startTime = System.nanoTime();
        arr = BinaryTree.bstSort(arr);
        long endTime = System.nanoTime();

        timeRecords.put("BST inorder", (endTime - startTime)/1000000);
        Checker.checkArr(arr);

        startTime = System.nanoTime();
        arrCopy = QuickSort.quicksrt(arrCopy);
        endTime = System.nanoTime();

        timeRecords.put("Quick Sort", (endTime - startTime)/1000000);
        Checker.checkArr(arrCopy);

        for (Entry<String, Long> e : timeRecords.entrySet()) System.out.printf("time taken by %s - %dms\n", e.getKey(), e.getValue());

        System.out.println("\nBenchmark Complete!!\n-------------------------------");

    }
}
