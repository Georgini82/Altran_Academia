import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamComPredicateClass {
    public static void main(String[] args) {
        System.out.println("Usando Stream e Predicate");
        List<Integer> lista = Arrays.asList(1, 1, 2, 3, 5, 1, 2, 4, 1, 7, 3, 8, 4, 10, 4, 3, 7, 10, 9, 4, 2, 7);

        Predicate<Integer> condicao = new Predicate<Integer>()
        {
            @Override
            public boolean test(Integer n){
                if (n % 2 == 0){
                    return true;
                }
                return false;
            }
        };

        lista.stream().filter(condicao).forEach(System.out::println);
    }
}
