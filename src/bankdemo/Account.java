package bankdemo;

import java.util.Scanner;

public class Account {

    // properties of account
    // to place the cursor in multiple lines alt + shift + click
    private int id;
    private String name;
    private String address;
    private String phoneNum;
    private double balance;
    private int pin;
    private String panNum;
    private long aadharNum;
    private Scanner sc = new Scanner(System.in);


    public Account(int id, String name, String address, String phoneNum, double balance, int pin, String panNum) {
        this(id, name, address, phoneNum, balance, pin, panNum, 0);
    }

    public Account(int id, String name, String address, String phoneNum, double balance, int pin, long aadharNum) {
       this(id, name, address, phoneNum, balance, pin, "", aadharNum);
    }

    public Account(int id, String name, String address, String phoneNum, double balance, int pin, String panNum, long aadharNum) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.balance = balance;
        this.pin = pin;
        this.panNum = panNum;
        this.aadharNum = aadharNum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        System.out.println("Enter you pin");
        int pinEntered = sc.nextInt();
        if(pinEntered == this.pin) {
            return balance;
        }else {
            System.out.println("invalid pin");
        }
        return 0;
    }

    public void setAddress(String address) {
        System.out.println("Enter you pin");
        int pinEntered = sc.nextInt();
        if(pinEntered == this.pin) {
            this.address = address;
            System.out.println("Address updated successfully");
        }else {
            System.out.println("Invalid pin, address not updated");
        }

    }

    public void setPhoneNum(String phoneNum) {
        System.out.println("Enter your pin");
        int pinEntered = sc.nextInt();
        System.out.println("Enter old phone number");
        String phNumEntered = sc.next();
        if(pinEntered == this.pin && this.phoneNum.equals(phNumEntered)) {
            this.phoneNum = phoneNum;
            System.out.println("Phone number updated successfully");
        }else {
            System.out.println("Invalid pin, Phone number not updated");
        }
    }

    public void setPin() {
        System.out.println("Enter your old pin");
        int pinEntered = sc.nextInt();
        if(pinEntered == this.pin) {
            System.out.println("Enter you new pin");
            this.pin = sc.nextInt();
            System.out.println("pin updated successfully");
        }else {
            System.out.println("Invalid old pin, Pin not updated");
        }
    }

    private int createRandomPin() {
        return (int)(Math.random()*(9999-1000 + 1) + 1000);
    }

    // forgot pin
    public void forgotPin() {
        System.out.println("Enter old phone number");
        String phNumEntered = sc.next();
        if (this.phoneNum.equals(phNumEntered)) {
            this.pin = createRandomPin();
            System.out.printf("Use this dummy pin %d to set your pin\n", this.pin);
            this.setPin();
        } else {
            System.out.println("Incorrect phone number");
        }
    }

    // withdraw
    public void withdraw(double amount) {
        if(amount > 0) {
            System.out.println("Enter your pin");
            int pinEntered = sc.nextInt();
            if(amount <= this.balance) {
                if (pinEntered == this.pin) {
                    this.balance -= amount;
                    System.out.println("Withdraw sucessfull");
                } else {
                    System.out.println("Invalid pin, Withdraw failed");
                }
            } else {
                System.out.println("Insufficient balance");
            }
        }else {
            System.out.println("Invalid amount");
        }
    }


    // deposite
    public void deposite(double amount) {
        System.out.println("Enter your pin");
        int pinEntered = sc.nextInt();
        if (amount > 0) {
            if (pinEntered == this.pin) {
                this.balance += amount;
                System.out.println("Deposite sucessfull");
            } else {
                System.out.println("Invalid pin, Deposite failed");
            }
        } else {
            System.out.println("Invalid amount");
        }
    }



}
