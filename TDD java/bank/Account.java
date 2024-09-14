package bank;

public class Account {

    private String name;
    private String pin;
    private String accountNumber;
    private double balance;

    public Account(String name, String pin, String accountNumber) {
        this.name = name;
        this.balance = balance;
        this.pin = "1111";
    }

    public String getName() {
        return name;
    }

    public  String getPin() {
        return pin;
    }

    public double getBalance(String pin) {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    private boolean pinValidator(String pin) {
        return this.pin.equals(pin);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (pinValidator(pin)) {
            this.balance -= amount;
        }
        else System.out.println("Invalid pin");
    }


        // add change-pin method and test
    }











