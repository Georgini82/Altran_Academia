import java.util.Arrays;
import java.util.List;

public class TrocaElementosArray {

    /*
     metodo generico de troca de posições entre dois arrays
     começa por receber um array
     transforma em lista
     reordena a lista
     devolva novo array do mesmo tipo do recebido
    */
    public static <T> void trocaPosicaoArray(T[] inputArray, int pos1, int pos2){
        List<T> lista = Arrays.asList(inputArray);
        /* tipo elemento?
        tmp = pos1
        pos1 = pos2
        pos2 = tmp
         */

        T tmp = lista.get(pos1);
        lista.set(pos1, lista.get(pos2));
        lista.set(pos2, tmp);

        // fazer o tostring
        for (T elemento:lista) {
            System.out.print(elemento + " ");
        }

    }

    public static void main(String[] args) {
        String[] arrayString = {"abc", "def", "efg", "a", "b", "c"};
        Integer[] arrayInteiros = {1,2,3,4,5};

        System.out.println("Array de strings inicial");
        System.out.println(Arrays.toString(arrayString));
        System.out.println("Array de strings após a troca");
        trocaPosicaoArray(arrayString,0,3);

        System.out.println("\n\nArray de inteiros inicial");
        System.out.println(Arrays.toString(arrayInteiros));
        System.out.println("Array de inteiros após a troca");
        trocaPosicaoArray(arrayInteiros,0,3);
    }

}
