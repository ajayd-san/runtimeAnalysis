public class Checker {
    public static boolean checkArr(Integer[] arr){
        for (int i = 0; i < arr.length - 1; ++i){
            if (arr[i] > arr[i + 1]){
                System.out.println("Array not sorted");
                return false;
            }
        }

        System.out.println("Array sorted");
        return true;
    }
}
