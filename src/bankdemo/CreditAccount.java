package bankdemo;

public class CreditAccount extends Account{

    public CreditAccount(int id, String name, String address, String phoneNum, double balance, int pin, String panNum) {
        super(id, name, address, phoneNum, balance, pin, panNum);
    }

    public CreditAccount(int id, String name, String address, String phoneNum, double balance, int pin, long aadharNum) {
        super(id, name, address, phoneNum, balance, pin, aadharNum);
    }

    public CreditAccount(int id, String name, String address, String phoneNum, double balance, int pin, String panNum, long aadharNum) {
        super(id, name, address, phoneNum, balance, pin, panNum, aadharNum);
    }
}
