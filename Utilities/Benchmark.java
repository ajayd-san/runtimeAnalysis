package Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import Algorithms.BinaryTree;
import Algorithms.QuickSort;

public class Benchmark {

    private long BenchmarkBST(int[] arr){
        long startTime = System.nanoTime();
        arr = BinaryTree.bstSort(arr);
        long endTime = System.nanoTime();
        return (endTime - startTime)/1000000;
    }

    private long BenchmarkQuickSrt(int[] arr){
        long startTime = System.nanoTime();
        arr = QuickSort.quicksrt(arr);
        long endTime = System.nanoTime();
        return (endTime - startTime)/1000000;
    }

    public void BenchmarkAll(int size, int loopcount){

        System.out.printf("Benchmark for %d elements\n-------------------------------\n", size);
        Map<String, Long> timeRecord = new HashMap<>();

        for (int i = 0; i < loopcount; ++i){
            int[] arr = new RandomGen().get_random(size);
            int[] arrCopy = Arrays.copyOf(arr, arr.length);
            long bstTime = BenchmarkBST(arr);
            long quicksrtTime = BenchmarkQuickSrt(arrCopy);
            Checker.checkArr(arr);
            Checker.checkArr(arrCopy);
            timeRecord.put("bst", timeRecord.getOrDefault("bst", (long) 0) + bstTime);
            timeRecord.put("quicksrt", timeRecord.getOrDefault("quicksrt", (long)0) + quicksrtTime);
        }


        for (Entry<String, Long> e : timeRecord.entrySet()) System.out.printf("time taken by %s - %dms\n", e.getKey(), e.getValue()/loopcount);

        System.out.println("\nBenchmark Complete!!\n-------------------------------");

    }
}
