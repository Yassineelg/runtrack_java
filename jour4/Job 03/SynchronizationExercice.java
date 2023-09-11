/*
 * SynchronizationExercice.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 11/09/2023
 */

public class SynchronizationExercice {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Utilisation : java Main <solde initial> <montant à retirer>");
            System.exit(1);
        }

        int initialBalance = Integer.parseInt(args[0]);
        int withdrawalAmount = Integer.parseInt(args[1]);

        BankAccount bankAccount = new BankAccount(initialBalance);

        Thread thread1 = new Thread(new WithdrawTask(bankAccount, withdrawalAmount));
        Thread thread2 = new Thread(new WithdrawTask(bankAccount, withdrawalAmount));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Interruption des threads : " + e.getMessage());
        }

        System.out.println("Solde final : " + bankAccount.getBalance());
    }
}