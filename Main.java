import Utilities.Benchmark;

public class Main {
    public static void main(String[] args) {
        Benchmark test = new Benchmark();
        int[] elems = {100, 1000, 10000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        for (int elem : elems)
            test.BenchmarkAll(elem, 5);
    }
}
