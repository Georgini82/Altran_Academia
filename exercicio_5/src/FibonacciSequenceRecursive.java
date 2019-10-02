public class FibonacciSequenceRecursive implements FibonacciSequence {

    @Override
    public int calculate(int n) {
        if (n <= 2)
            return 1;
        else{
            return calculate(n-2) + calculate(n-1);
        }
    }
}
