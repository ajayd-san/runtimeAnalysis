import Utilities.Benchmark;

public class Main {
    public static void main(String[] args) {
        Benchmark test = new Benchmark();

        test.BenchmarkAll(1000000, 5);
    }
}
