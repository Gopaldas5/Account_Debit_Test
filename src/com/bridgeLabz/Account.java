package com.bridgeLabz;

public class Account {
        private double balance;
      //  public int Account;

    public Account(double initialBalance)
        {
            if ( initialBalance > 0.0 )
               this.balance = initialBalance;
        }

        public void credit( double amount )
        {
            balance = balance + amount;
        }

        public void debit(double amount)
        {
            if (amount > balance)
                System.out.println("Debit amount exceeded account balance.");
            else {
                balance = balance - amount;
            }
        }

        public double getBalance()
        {
            return balance;
        }

//    @Override
//    public String toString() {
//        return "Account{" +
//                "balance = " + balance +
//                ", accountName = " + accountName +
//                ", Account = " + Account +
//                '}';
//    }

}
