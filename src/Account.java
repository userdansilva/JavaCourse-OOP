public class Account {
    private long number;
    private double balance;
    private String name;
    private String email;
    private long phoneNumber;

    public long getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(long phoneNumber) {
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
