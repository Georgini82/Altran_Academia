import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorter {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("9","A","Z","1","B","Y","4","a","c");

        lista.sort(Comparator.naturalOrder());
        System.out.println("Natural Order: " + lista);

        lista.sort(Comparator.reverseOrder());
        System.out.println("Reverse Order: " + lista);

    }
}
