package model.entities;

public class Conta {
    private int accountNumber;
    private String name;
    private double saldo;

    public Conta() {}

    public Conta(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public Conta(int accountNumber, String name, double initialDeposit) {
        this(accountNumber, name); 
        deposit(initialDeposit);  
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double value) {
        saldo += value;
    }

    public void withdraw(double value) {
        saldo -= (value + 5.00);
    }

    @Override
    public String toString() {
        return "Account " 
            + accountNumber 
            + ", Holder: " 
            + name 
            + ", Balance: $ " 
            + String.format("%.2f", saldo);
    }
}