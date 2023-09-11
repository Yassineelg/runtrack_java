/*
 * WithdrawTask.java
 * by: https://github.com/Yassineelg
 * mail: yassineelgherrabi@gmail.com
 * created: 11/09/2023
 */

public class WithdrawTask implements Runnable {
    private BankAccount bankAccount;
    private int withdrawalAmount;

    public WithdrawTask(BankAccount bankAccount, int withdrawalAmount) {
        this.bankAccount = bankAccount;
        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(withdrawalAmount);
    }
}