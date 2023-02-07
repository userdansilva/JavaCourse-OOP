public class Dog {
    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public static void barkStatic(String name) {
        Dog.name = name;
        System.out.println("Woof " + Dog.name);
    }

    public void bark() {
        System.out.println("The dog " + Dog.name + " had woof");
    }
}
