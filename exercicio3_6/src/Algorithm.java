import java.util.Collection;

public class Algorithm {

    public static int countIf(Collection<Integer> ci, OddPredicate oddPredicate) {
        return (int) ci.stream().filter(a -> oddPredicate.test(a)).count();
    }

    // criar metodo generico aqui
    public static <T> int countIfGeneric(Collection<Integer> ci, UnaryPredicate<T> predicate) {
        return (int) ci.stream().filter(a -> predicate.test(a)).count();
    }

}
