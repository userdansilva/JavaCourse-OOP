public class Main {
    public static void main(String[] args) {
        Customer defaultCustomer = new Customer();

        System.out.println("Hi " + defaultCustomer.getName() +
                " (" + defaultCustomer. getEmail() +
                "), your credit limit is " + defaultCustomer.getCreditLimit());

        Customer daniel = new Customer("Daniel" , "daniel@com.br");

        System.out.println("Hi " + daniel.getName() +
                " (" + daniel. getEmail() +
                "), your credit limit is " + daniel.getCreditLimit());

        Customer pedro = new Customer("Pedro", 200.00, "pedro@com.br");

        System.out.println("Hi " + pedro.getName() +
                " (" + pedro. getEmail() +
                "), your credit limit is " + pedro.getCreditLimit());
    }
}
