public class Caelum {
    public static void main(String[] args) {

        for (int i = 40; i > 0; i--){
            factorial(i);
        }

        System.out.println();
        //imprimeNum150a300();
        //imprimeSoma1a1000();
        //imprimeMultiplos3entre1a100();
        ex7_caelum(13);
    }

    private static void imprimeMultiplos3entre1a100() {
        System.out.println();
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                System.out.println(i + " é multiplo de 3");
            }
        }
    }

    private static void imprimeSoma1a1000() {
        int i = 1;
        int soma = 0;
        while(i <= 1000){
            soma += i;
            i++;
        }
        System.out.println(soma);
    }

    private static void factorial(int num){
        System.out.println("O factorial de " + num + " é: ");
        long total;
        for(total = 1; num > 0; num--){
            total *= num;
        }
        System.out.println(total);
    }

    private static void imprimeNum150a300 (){
        for(int i = 150; i <= 300; i++){
            System.out.println(i);
        }
    }

    private static void ex7_caelum (int x){
        while(x != 1){
            if(x % 2 == 0)
                x /= 2;
            else
                x = 3 * x + 1;

            System.out.print(x);
            if(x != 1)
                System.out.print(" -> ");
        }
    }


}

