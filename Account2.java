public class BankAccount {
    public static void main(String[] args) {
        double balance = 25000.0;
        double deposit = 15000.0;
        double transfer = 11000.0;
        double interestRate = 0.02;
        int months = 12;

        // Calculate current balance
        balance += deposit;
        balance -= transfer;

        // Calculate interest value
        double interest = balance * interestRate * months;


        System.out.println("Current Balance: " + balance);
        System.out.println("Interest Value: " + interest);

        // Employee
        double salary = 50000.0;
        double da = salary * 0.12;
        double hra = salary * 0.13;
        double pf = salary * 0.15;
        double gross = salary + da + hra + pf;

        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + gross);
    }
}
