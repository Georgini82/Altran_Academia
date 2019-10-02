public class HelloWorldAnonymousClasses {

    // definir a interface e os seus metodos
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello() {

        class EnglishGreeting implements HelloWorld{
            String name = "world";

            public void greet(){
                greetSomeone("world");
            }

            public void greetSomeone(String someone){
                name = someone;
                System.out.println("Hello" + name);
            }
        }

        // instancia-se a classe anterior
        HelloWorld englishGreeting = new EnglishGreeting();

        // instancia-se interface HelloWorld em que se faz Override de metodos
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";

            @Override
            public void greet() {
                greetSomeone(name);
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        // instancia-se interface HelloWorld em que se faz Override de metodos
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";

            @Override
            public void greet() {
                greetSomeone(name);
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola " + name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}