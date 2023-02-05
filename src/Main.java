public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        System.out.println("Initial balance is " + account.getBalance());

        account.depositAndPrintBalance(200.00);

        account.withdrawAndPrintBalance(300.00);

        account.withdrawAndPrintBalance(50.00);
        account.withdrawAndPrintBalance(200.00);
        account.withdrawAndPrintBalance(150.00);
    }
}
