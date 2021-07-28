package bankdemo;

import java.util.Scanner;

public class CreditAccount extends Account {
    private double cashLimit;
    private Scanner sc = new Scanner(System.in);
    private double fee = 50;
    private double creditLimit;

    public CreditAccount(int id, String name, String address, String phoneNum, double balance, int pin, String panNum) {
        super(id, name, address, phoneNum, balance, pin, panNum);
        // balance is nothing but credit limit
        this.creditLimit = balance;
        this.cashLimit = balance * 0.3;
    }

    public CreditAccount(int id, String name, String address, String phoneNum, double balance, int pin, long aadharNum) {
        super(id, name, address, phoneNum, balance, pin, aadharNum);
        this.creditLimit = balance;
        this.cashLimit = balance * 0.3;
    }

    public CreditAccount(int id, String name, String address, String phoneNum, double balance, int pin, String panNum, long aadharNum) {
        super(id, name, address, phoneNum, balance, pin, panNum, aadharNum);
        this.creditLimit = balance;
        this.cashLimit = balance * 0.3;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            System.out.println("Enter your pin");
            int pinEntered = sc.nextInt();
            this.cashLimit = this.balance * 0.3;
            if (amount <= this.cashLimit) {
                if (pinEntered == this.pin) {
                    this.balance -= amount;
                    this.balance -= fee;
                    this.cashLimit = this.balance * 0.3;
                    System.out.println("Withdraw successful for amount " + amount);
                } else {
                    System.out.println("Invalid pin, Withdraw failed");
                }
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid amount");
        }
    }

    // paying dues
    @Override
    public void deposite(double amount) {
        System.out.println("Enter your pin");
        int pinEntered = sc.nextInt();
        double dueAmount = this.creditLimit - this.balance;
        if (amount > 0) {
            if (pinEntered == this.pin) {
                if (amount <= dueAmount && amount >= dueAmount * 0.3) {
                    this.balance += amount;
                    this.cashLimit = this.balance * 0.3;
                    System.out.println("Payment sucessfull");
                } else {
                    System.out.printf("Amount should be in between %f and %f\n", dueAmount * 0.3, dueAmount);
                }
            } else {
                System.out.println("Invalid pin, Payment failed");
            }
        } else {
            System.out.println("Invalid amount");
        }
    }
}

