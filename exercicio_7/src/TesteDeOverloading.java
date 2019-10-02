public class TesteDeOverloading {

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int multiply(int a, int b, int c){
        return a*b*c;
    }

    public static float multiply(int a, double b){
        return (float)a*(float)b;
    }

    public static void main(String[] args) {
        System.out.println("2x2=" + multiply(2,2));
        System.out.println("4x3x2=" + multiply(4,3,2));
        System.out.println("10*2.2=" + multiply(10,2.2));
    }
}
