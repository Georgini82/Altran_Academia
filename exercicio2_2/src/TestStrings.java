import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestStrings {

    public static void testa(ArrayList arrayList){
        // usar lambdas e streams
        System.out.println("Testa as string:");
        List<String> lista = (List<String>) arrayList
                                .stream()
                                .filter((l) -> (testaString(l.toString())))
                                .collect(Collectors.toList());
        System.out.println(lista.toString());
    }

    public static boolean testaString(String str){
        // testa se string começa com "a" e tem o total de 3 letras
        if (str.length() == 3 && str.charAt(0) == 'a'){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        // ler três strings a adicionar a uma lista
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        System.out.println("String 1: " + str1 + " com o tamanho: " + str1.length());
        System.out.println("String 1: " + str2 + " com o tamanho: " + str2.length());
        System.out.println("String 1: " + str3 + " com o tamanho: " + str3.length());

        ArrayList<String> lista = new ArrayList<>();
        lista.add(str1);
        lista.add(str2);
        lista.add(str3);
        System.out.println("Sout da lista:\n" + lista.toString());

        testa(lista);
    }
}
