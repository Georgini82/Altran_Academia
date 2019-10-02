public class teste {

    // define-se a "fucntional interface"
    // esta contem apenas um unico metodo abstracto
    public interface FuncInterface{
        void abstractFun(int x);
        default void normalFun(){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        // expressao lambda para implementar a interface funcional
        FuncInterface f = (int x) -> System.out.println(2*x);

        f.abstractFun(5);
    }
}
