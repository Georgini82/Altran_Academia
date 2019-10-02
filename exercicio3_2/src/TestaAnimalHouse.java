public class TestaAnimalHouse {
    public static void main(String[] args) {
        // a) compile com erro de objetos diferentes
        // AnimalHouse<Animal> house = new AnimalHouse<Cat>();

        // b) igual ao anterior
        // AnimalHouse <Dog> house = new AnimalHouse<Animal>();

        // c) erro em house.setAnimal(new Cat()); por Cat() ser imcompativel
        // AnimalHouse<?> house = new AnimalHouse<Cat>();
        // house.setAnimal(new Cat());

        // d) compila sem erros
        AnimalHouse house = new AnimalHouse();
        house.setAnimal(new Dog());
        System.out.println(house.getAnimal().getClass().toString());
    }
}
