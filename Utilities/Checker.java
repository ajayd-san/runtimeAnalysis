package Utilities;
import Exceptions.NotSortedException;

public class Checker {
    public static boolean checkArr(int[] arr){
        for (int i = 0; i < arr.length - 1; ++i){
            try {
                if (arr[i] > arr[i + 1]){
                    throw new NotSortedException("Array not Sorted, check sorting algorithms again");
                }
            }
            catch (NotSortedException e){
                System.out.println(e);
                System.exit(1);
            }
        }
        return true;
    }
}
