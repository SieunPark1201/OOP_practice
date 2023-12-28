package Contests.Week6;

public class Con_01 {
        public static void main(String[] args) {
            BankAccount account1 = new BankAccount(100.0);
            BankAccount account2 = new BankAccount(200.0);

            account1.deposit(50.0);
            account2.deposit(100.0);

            System.out.println("Account 1 balance: " + account1.getBalance());
            System.out.println("Account 2 balance: " + account2.getBalance());

            System.out.println("Total bank balance: " + BankAccount.getTotalBalance());
        }
    }


class BankAccount {
    private double deposit;
    private static double totalBalance = 0.0;

    public BankAccount(double deposit) {
        this.deposit = deposit;
        totalBalance += deposit;

    }

    public void deposit(double deposit) {
        this.deposit += deposit;
        totalBalance += deposit;
    }

    public Double getBalance() {
        return this.deposit;
    }

    public static double getTotalBalance() {
        return totalBalance;
    }

}

