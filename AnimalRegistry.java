public class AnimalRegistry {
    private final Sheep sheepPrototype;
    private final Cow cowPrototype;
    private final Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep(4, "Baa", "Grass", "DefaultSheep");
        cowPrototype = new Cow(4, "Moo", "Hay");
        horsePrototype = new Horse(4, "Neigh", "Grain", "Brown");
    }

    public Animal createSheep(String name) {
        Sheep newSheep = (Sheep) sheepPrototype.clone();
        newSheep.name = name;
        return newSheep;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}
