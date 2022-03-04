package entities;

public interface IAccount {

    void deposit(double value);

    void withdraw(double value);

    void transfer(Account destinationAccount, double value);

    void printBankStatement();

    void bankInterest(double balance, double interest);


}
