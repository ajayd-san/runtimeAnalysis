# Compare runtime of Quick Sort and BST sort

- clone the code, compile and run.

By default, the program outputs benchmarking results for arrays from 100 elements to 10 Million elements. 


## Modification
The project has been arranged in such a way that all the algorithms and benchmarking code doesn't need any interaction from the user.
The default behaviour, is to benchmark on 100 to 10 million elements. This is done 5 times for a fixed array size, and it's mean is output to terminal as benchmarking results. However, it can be changed, by modifiying `Main.py`. 

Just pass the desired array size and the number of times to run before taking mean of execution time to the `test.BenchmarkAll()` method.
