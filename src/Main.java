public class Main {
    public static void main(String[] args) {
        Customer daniel = new Customer();
        System.out.println(daniel.toString());

        Customer carlos = new Customer("Carlos", "carlos@mail.com");
        System.out.println(carlos.toString());

        Customer ana = new Customer("Ana", 2_000.0, "ana@mail.com");
        System.out.println(ana);
    }
}
