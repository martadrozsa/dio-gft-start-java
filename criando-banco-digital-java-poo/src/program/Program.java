package program;

import entities.*;

public class Program {
    public static void main(String[] args) {

        Client client1 = new Client();
        client1.setName("Marta");
        client1.setCpf("123.456.789-14");
        client1.setPhone("999999999");

        Account checkingAccount1 = new CheckingAccount(client1);
        checkingAccount1.deposit(100);

        Account savingsAccount1 = new SavingsAccount(client1);
        checkingAccount1.transfer(savingsAccount1, 100);

        System.out.println("\n------Checking account statement------");
        checkingAccount1.printDatas();

        System.out.println("\n------Savings account statement------");
        savingsAccount1.printDatas();

        Client client2 = new Client();
        client2.setName("Vitor");
        client2.setCpf("123.000.789-14");
        client2.setPhone("999998888");

        Account checkingAccount2 = new CheckingAccount(client2);
        checkingAccount2.withdraw(300);

        Account savingsAccount2 = new SavingsAccount(client2);
        savingsAccount2.bankInterest(450,5);

        System.out.println("\n------Checking account statement------");
        checkingAccount2.printDatas();

        System.out.println("\n------Savings account statement------");
        savingsAccount2.printDatas();

    }
}
