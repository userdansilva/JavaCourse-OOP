public class Main {
    public static void main(String[] args) {
        String textBlock = """
                    List items
                        • First Item
                        • Second Item""";

        System.out.println(textBlock);

        System.out.printf("My age is %d and my birth year is %d, and a I have %.2f", 25, 1997, (float) 10.0);

        String formattedString = String.format("I have R$ %.2f", 35.50);
        System.out.println(formattedString);

        String otherFormatted = "I have R$ %.2f".formatted(35.50);
        System.out.println(otherFormatted);
    }
}
