public class FibonacciSequenceIterative implements FibonacciSequence {

    @Override
    public int calculate(int n) {
        int valorAnterior = 0;
        int valorAntesDoAnterior = 0;
        int valorAtual = 1;

        for (int i = 1; i < n; i++){
            valorAntesDoAnterior = valorAnterior;
            valorAnterior = valorAtual;
            valorAtual = valorAntesDoAnterior + valorAnterior;
        }
        return valorAtual;
    }
}
