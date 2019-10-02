import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AchaMaximoGenerico{

    // metodo generico de descobrir valor maximo entre um range de elementos
    // generico para ser possivel usar double, float, int, long...

    public static <T extends Comparable> void imprimeMaximo(T[] inputArray, int pos1, int pos2){
        // List<T> lista = Arrays.asList(inputArray);
        // LastResort: ordenar por natural order e ir buscar o ultimo valor

        // cria a lista atraves dos range definido e do array recebido
        List<T> lista = IntStream
                .range(pos1, pos2 + 1)
                .mapToObj(l -> inputArray[l])
                .collect(Collectors.toList());

        // fazer o tostring
        System.out.println("lista filtrado com o range [" + pos1 + "," + pos2 + "]: " + lista.toString());

        // calcular o valor maximo na lista
        System.out.println("Valor maximo da lista anterior: " + max(lista));
    }

    public static <T extends Comparable<T>> T max(List <T> elements) {
        T max = elements.get(0);
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // definir diferentes tipos de array
        Integer[] arrayDeInteiros = {1,2,3,4,5,6,7,8};
        Double[] arrayDeFloats = {10.0,11.1,12.2,13.3,14.4,15.5};

        System.out.println("Lista original: " + Arrays.toString(arrayDeInteiros));
        imprimeMaximo(arrayDeInteiros, 2,4);
        System.out.println();
        System.out.println("Lista original: " + Arrays.toString(arrayDeFloats));
        imprimeMaximo(arrayDeFloats, 2,4);
    }
}
