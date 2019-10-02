public class CarParts {

    private static int factoryID = 123;

    public static class Wheel {
        public  Wheel(){
            System.out.println("Whell created with factory ID: " + factoryID);
        }
    }

    public CarParts(){
        System.out.println("Car Parts object created!");
    }

}
