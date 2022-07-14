package com.bridgeLabz;

import java.util.Scanner;

public class AccountTest {
    public static void main( String args[] ) {
        Account account1 = new Account(5000.00);

        // account1.getBalance();

        System.out.println("Your Account balance is :- " + account1.getBalance());

        Scanner input = new Scanner(System.in);

        double depositAmount;
        System.out.print("Enter deposit amount to account :- ");
        depositAmount = input.nextDouble();

        System.out.println("Adding amount to account :- " + depositAmount);
        account1.credit(depositAmount);

        System.out.println("Your Account balance is now :- " + account1.getBalance());
        double withdrawalAmount;
        System.out.print("Enter withdrawal amount :- ");
        withdrawalAmount = input.nextDouble();
        System.out.println("Withdraw Amount from account :- " + withdrawalAmount);
        account1.debit(withdrawalAmount);

        System.out.println("Remaining balance in your account is :- " + account1.getBalance());
    }
}
