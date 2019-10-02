public class ValueOfInteger {
    public static void main(String[] args) {
        teste();
    }

    private static void teste(){
        System.out.println(Integer.valueOf(127) == Integer.valueOf(127));
        System.out.println(Integer.valueOf(227) == Integer.valueOf(227));
        // existe conversão entre int e Integer (autoboxing)
        // Integer.valueOf(int n) só aceita valores entre -128 e 127
        // a comparação "olha" para os endereços de memoria,
        // devido a um sistema de cache próprio a comparação
        // entre valores acima é possivel
    }
}
