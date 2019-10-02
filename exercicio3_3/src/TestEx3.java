public class TestEx3 {

    public static class Algorithm {
        // não compile pois faltava definir T
        // public static T max(T x, T y){
        public static <T> T max(T x, T y){
            // nao se podem comparar objectos com >
            return x > y ? x : y;
        }

    }

    public static void main(String[] args) {


    }

}
