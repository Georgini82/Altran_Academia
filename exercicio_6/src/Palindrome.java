public class Palindrome {

    public static boolean calculate(String a){
        // constuir uma string invertida
        int length = a.length();
        String rev = "";

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + a.charAt(i);
        //System.out.println(rev.toString());

        // compara ambas e devolver resultado
        if (a.equals(rev))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String str = "abcba";
        String str1 = "marram";
        String str2 = "abcd";
        String str3 = "cde";

        System.out.println(calculate(str));
        System.out.println(calculate(str1));
        System.out.println(calculate(str2));
        System.out.println(calculate(str3));
    }
}
