package entities;

import lombok.Getter;

@Getter
public abstract class Account implements IAccount{

    private static final  int DEFAULT_AGENCY = 0;
    private static int SEQUENTIAL = 1;

    protected int bankOffice;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.bankOffice = Account.DEFAULT_AGENCY;
        this.number = SEQUENTIAL++;
        this.client = client;
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void withdraw(double value) {
        this.balance -= value;
    }

    @Override
    public void transfer(Account destinationAccount, double value) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    @Override
    public void bankInterest(double balance, double interest) {
        this.balance -= interest + 5.0;
    }

    public void printDatas() {
        System.out.printf("Bank Office: %d%n", this.bankOffice);
        System.out.printf("Number: %d%n", this.number);
        System.out.printf("Balance: %.2f%n", this.balance);
        System.out.println("Client: " + this.client.getName() + "\nCPF: " + client.getCpf() + "\nPhone: " + client.getPhone());
    }
}
