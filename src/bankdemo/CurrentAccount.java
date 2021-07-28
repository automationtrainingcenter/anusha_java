package bankdemo;

import java.util.Scanner;

public class CurrentAccount extends Account{

    private double dailyLimit;
    private Scanner sc = new Scanner(System.in);

    public CurrentAccount(int id, String name, String address, String phoneNum, double balance, int pin, String panNum) {
        super(id, name, address, phoneNum, balance, pin, panNum);
        this.dailyLimit = 100000;
    }

    public CurrentAccount(int id, String name, String address, String phoneNum, double balance, int pin, long aadharNum) {
        super(id, name, address, phoneNum, balance, pin, aadharNum);
        this.dailyLimit = 100000;
    }

    public CurrentAccount(int id, String name, String address, String phoneNum, double balance, int pin, String panNum, long aadharNum) {
        super(id, name, address, phoneNum, balance, pin, panNum, aadharNum);
        this.dailyLimit = 100000;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0) {
            System.out.println("Enter your pin");
            int pinEntered = sc.nextInt();
            if(amount <= this.balance) {
                if (amount <= this.dailyLimit) {
                    if (pinEntered == this.pin) {
                        this.balance -= amount;
                        this.dailyLimit -= amount;
                        System.out.println("Withdraw sucessfull for amount "+amount);
                    } else {
                        System.out.println("Invalid pin, Withdraw failed");
                    }
                } else {
                    System.out.println("You reached the daily limit or your daily limit balance is "+this.dailyLimit+", so you can not withdraw "+amount);
                }
            } else {
                System.out.println("Insufficient balance");
            }
        }else {
            System.out.println("Invalid amount");
        }
    }
}
