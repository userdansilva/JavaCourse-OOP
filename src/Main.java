public class Main {
    public static void main(String[] args) {
        Employee daniel = new Employee("Daniel", "10/13/1997", "01/01/2018");
        daniel.terminate("01/01/2020");

        System.out.println(daniel.getAge());
        System.out.println(daniel.collectPay());
        System.out.println(daniel);

        SalariedEmployee pedro = new SalariedEmployee("Pedro", "10/13/1997", "01/01/2018", 35_000);

        pedro.retire();
        System.out.println(pedro);
        System.out.println(pedro.collectPay());

        HourlyEmployee august = new HourlyEmployee("August", "10/13/1997", "01/01/2018", 15);
        System.out.println(august);
        System.out.println(august.collectPay());
        System.out.println(august.getDoublePay());
    }
}
