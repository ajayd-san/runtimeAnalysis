package Utilities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomGen {

    public int[] get_random(int size){
        List<Integer> arr = new ArrayList<>(size);
        for (int i = 0; i < size; ++i) {
            arr.add(i);
        }
        Collections.shuffle(arr);
        return arr.stream().mapToInt((Integer i) -> i.intValue()).toArray();
    }
}
