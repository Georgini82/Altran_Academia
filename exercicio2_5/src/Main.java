import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static class User implements Comparable<User>{
        private String name;
        private int age;

        public User(String name, int age){
            this.age = age;
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }


        @Override
        public int compareTo(User o) {
            return this.name.compareTo(o.getName());
        }
    }

    static List<User> users = Arrays.asList(
            new User("C", 30),
            new User("D", 40),
            new User("A", 10),
            new User("B", 20),
            new User("E", 50)
    );

    static void sortUsersByAge(){
        List<User> ordenado = users
                                .stream()
                                .sorted()
                                .collect(Collectors.toList());
        ordenado.forEach(user -> System.out.println(user.getName()));
    }

    public static void main(String[] args) {
        sortUsersByAge();
    }

}