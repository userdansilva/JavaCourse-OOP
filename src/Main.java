public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Any Animal", "Big", 300.0);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog(50.00, "pointed", "curly");
        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }

    public static void doAnimalStuff(Dog dog, String speed) {
        dog.bark();
        dog.move(speed);
        System.out.println(dog);
        System.out.println("_ _ _ _");
    }
}
