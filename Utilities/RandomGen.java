package Utilities;
import java.util.Arrays;
import java.util.Collections;

public class RandomGen {

    public Integer[] get_random(int size){
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));
        return arr;
    }

}
