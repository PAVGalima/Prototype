
public class TestAnimal {

    public static void main(String[] args) {
        System.out.println();
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Joey");
        Animal cow1 = registry.createCow();
        Animal horse1 = registry.createHorse();

        sheep1.makeSound();
        cow1.makeSound();
        horse1.makeSound();
        System.out.println();
    }
}
