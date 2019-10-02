public class Fibonacci {
    /**
     * metodo para calcular recursivamento o numero de fibonacci
     * @param i
     * @return
     */
    public int calculaFibonnaci(int i) {
        if (i <= 2 && i > 0)
            return 1;
        else
            return calculaFibonnaci(i - 1) + calculaFibonnaci(i - 2);
    }
}

class TestaFibonacci{
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 1; i <= 10; i++){
            int resultado = fibonacci.calculaFibonnaci(i);
            System.out.print(resultado + " ");
        }

        // Conta conta = new Conta();
    }
}

