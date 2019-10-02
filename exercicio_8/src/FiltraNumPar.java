import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiltraNumPar{
    public static void main(String[] args) {

    // criação do ArrayList inicializado com valores convertidos de um Array para simplificar o código
    ArrayList<Integer> lista = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    // outra maneira de criar um obj do tipo ArrayList
    // importa java.util.List
    // List lista = new ArrayList();

    // iterar uma lista de numeros e guardar os valores noutra lista
    ArrayList<Integer> outraLista = new ArrayList();
    for (int i = 0; i < lista.size(); i++){
        outraLista.add(lista.get(i));
    }
    System.out.println(outraLista.toString());

    // usar java streams para filtrar os numeros e guardar o resultado numa lista nova
    List<Integer> listaFinal = outraLista
                                        .stream()
                                        .filter((l) -> (l % 2 == 0))
                                        .collect(Collectors.toList());

    System.out.println(listaFinal);
    }
}
