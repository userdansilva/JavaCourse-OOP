public class DogStatic {
    private static String name;

    public DogStatic(String name) {
        DogStatic.name = name;
    }

    public static void barkStatic(String name) {
        DogStatic.name = name;
        System.out.println("Woof " + DogStatic.name);
    }

    public void bark() {
        System.out.println("The dog " + DogStatic.name + " had woof");
    }
}
