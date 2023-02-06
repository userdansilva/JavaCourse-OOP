public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account() {
        this("Default name", "Default email", "Default phone number");
    }

    public Account(String name, String email, String phoneNumber) {
        this("12345-0", 0.00, name, email, phoneNumber);
    }

    public Account(String number, double balance, String name,
                   String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositAndPrintBalance(double value) {
        balance += value;
        System.out.println("Deposit of R$ " + value
                + " was made. New balance is R$ " + balance);
    }

    public void withdrawAndPrintBalance(double value) {
        if ((balance - value) >= 0) {
            balance -= value;
            System.out.println("Withdraw of R$ " + value
                    + " was made. New balance is R$ " + balance);
            return;
        }

        System.out.println("Fail to withdraw. R$ " + value
                + " is not available. Balance is R$ " + balance);
    }
}
