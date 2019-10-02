import java.lang.reflect.Field;

public class TesteReflection {

    public static class PrivateFields{
        private String name;
        public String getName(){
            return name;
        }
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PrivateFields instance = new PrivateFields();
        Field field = PrivateFields.class.getDeclaredField("name");
        field.setAccessible(true);
        field.set(instance, "sample name");
        System.out.println(instance.getName());
    }

}
