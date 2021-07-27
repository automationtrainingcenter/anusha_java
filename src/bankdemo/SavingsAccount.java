package bankdemo;

public class SavingsAccount extends Account{

    public SavingsAccount(int id, String name, String address, String phoneNum, double balance, int pin, String panNum) {
        super(id, name, address, phoneNum, balance, pin, panNum);
    }

    public SavingsAccount(int id, String name, String address, String phoneNum, double balance, int pin, long aadharNum) {
        super(id, name, address, phoneNum, balance, pin, aadharNum);
    }

    public SavingsAccount(int id, String name, String address, String phoneNum, double balance, int pin, String panNum, long aadharNum) {
        super(id, name, address, phoneNum, balance, pin, panNum, aadharNum);
    }
}
