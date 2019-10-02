public class TesteSquareRoot {
    public static void main(String[] args) {
        MySquareRoot mySquareRoot = new MySquareRoot();
        System.out.println(mySquareRoot.findSquareRoot(9));

        // Anonymous Implementation da interface SquareRoot
        SquareRoot mySquareRootAnonymous = new SquareRoot() {
            @Override
            public double findSquareRoot(int n) {
                return Math.sqrt(n);
            }
        };

        System.out.println(mySquareRootAnonymous.findSquareRoot(16));

        // utilização de lambdas
        // (parametros de entrada) -> (parametros de saida)

        SquareRoot lambdasSquareRoot = (int n) -> (Math.sqrt(n));
        System.out.println(lambdasSquareRoot.findSquareRoot(25));
    }
}
