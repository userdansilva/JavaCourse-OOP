public class Main {
    public static void main(String[] args) {
        System.out.printf("""
                    List of items
                        • Item %d
                        • item %d
                        """, 1, 2);

        System.out.println("-------");

        String name = "Daniel";
        int age = 25;

        System.out.printf("My name is %s and I am %.2f years old %n", name, (float) age);

        System.out.println("-------");

        for (int i = 1; i <= 100_000; i *= 10) {
            System.out.printf("My number is %6d%n", i);
        }

        System.out.println("-------");

        String formattedString = String.format("My name is %s", name);
        System.out.println(formattedString);

        formattedString = "My age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
