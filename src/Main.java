public class Main {
    public static void main(String[] args) {
        Account account = new Account("(77) 98884-7504", 100.0, "Daniel Sousa",
                "daniel.sousasilva97@outlook.com", "(77) 988847504");

        System.out.println(account.getBalance());
        account.deposit(100.0);
        System.out.println(account.getBalance());
        account.withdraw(50.0);
        System.out.println(account.getBalance());
        account.withdraw(500.0);
        System.out.println(account.getBalance());
        account.withdraw(150.0);
        System.out.println(account.getBalance());
    }
}
