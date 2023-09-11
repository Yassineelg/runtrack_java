/*
 * BankAccount.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 11/09/2023
 */

public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " a retiré " + amount + ".");
        } else {
            System.out.println(
                    Thread.currentThread().getName() + " n'a pas pu retirer " + amount + " (solde insuffisant).");
        }
    }

    public synchronized int getBalance() {
        return balance;
    }
}