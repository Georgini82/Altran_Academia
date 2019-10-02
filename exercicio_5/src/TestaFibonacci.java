public class TestaFibonacci {
    public static void main(String[] args) {
        FibonacciSequenceIterative fi = new FibonacciSequenceIterative();
        FibonacciSequenceRecursive fr = new FibonacciSequenceRecursive();

        System.out.println("9 numero da sequencia de Fib através de Iteração: " + fi.calculate(9));
        System.out.println("9 numero da sequencia de Fib através de Recursividade: " + fr.calculate(9));
    }
}
