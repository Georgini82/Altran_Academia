import java.util.*;

public class Test {

    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        int count = Algorithm.countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);

        int count2 = Algorithm.countIfGeneric(ci, new OddPredicate());
        System.out.println("Number of odd integers Generics = " + count2);

        int count3 = Algorithm.countIfGeneric(ci, new PrimePredicate());
        System.out.println("Number of prime integers Generics = " + count3);

    }
}
