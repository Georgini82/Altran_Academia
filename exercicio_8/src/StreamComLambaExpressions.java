import java.util.Arrays;
import java.util.List;

public class StreamComLambaExpressions {
    public static void main(String[] args) {
        System.out.println("Usando Stream só com lambda");
        List <Integer> lista = Arrays.asList(1, 1, 2, 3, 5, 1, 2, 4, 1, 7, 3, 8, 4, 10, 4, 3, 7, 10, 9, 4, 2, 7);

        lista.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
