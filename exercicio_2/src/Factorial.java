public class Factorial {

    public static void main(String[] args) {
        factorial();
    }

    private static void factorial(){
        int total = 1;
        for(int i = 1; i <= 10; i++){
            total = 1;
            for(int j = 1; j <= i; j++){
                total *= j;
            }
            System.out.println("Factorial de " + i + " é: " + total);
        }
    }

}
