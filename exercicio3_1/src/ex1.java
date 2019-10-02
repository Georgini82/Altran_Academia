import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ex1 {

    // metodo generico imprime array
    public static <T> void imprime(T[] arrayRecebido){
        for (T elemento:arrayRecebido) {
            System.out.print(elemento + " ");
        }
    }

    // metodo generico filtar array
    public static <T> List<T> filtra(T[] arrayRecebido, Predicate<T> predicate){
        System.out.println("Array filtrado: ");
        // List<T> lista = Arrays.asList(arrayRecebido);
        // o predicado encontra-se dentro do filter
        // modificar para o metodo receber o predicado que se quer
        //lista.stream().filter(a -> a.toString().charAt(0)=='a' || a.equals(2)).forEach(System.out::println);
        // lista.stream().filter((Predicate<? super T>) predicate).forEach(System.out::println);
        return Arrays.stream(arrayRecebido).filter(predicate).collect(Collectors.toList());

    }

    // definir objectos do tipo predicate
    // completar...
    /*public static Predicate<ex1> testa(){
        return a -> a.toString().charAt(0)=='a';
    }*/



    public static void main(String[] args) {
        String[] arrayDeStrings = {"abc", "PSP", "cenas", "testing"};
        Integer[] arrayDeInteiros = {1,2,3,4,5};

        ex1 e = new ex1();
        System.out.println("\nArray de inteiros:");
        imprime(arrayDeInteiros);

        System.out.println("\n\nArray de strings");
        imprime(arrayDeStrings);

        List<String> lista = filtra(arrayDeStrings, ((a -> a.charAt(0) == 'a')));
        List<Integer> outraLista = filtra(arrayDeInteiros, (a -> a.intValue() == 2));

        System.out.println(lista.toString());
        System.out.println(outraLista.toString());

    }

}
