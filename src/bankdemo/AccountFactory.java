package bankdemo;

public class AccountFactory {

    public static Account createAccount(AccountType accType, int id, String name, String address, String phoneNum, double balance, int pin, String panNum, long aadharNum) {
        Account account = null;
        switch (accType) {
            case SAVINGS:
                account = new SavingsAccount(id, name, address, phoneNum, balance, pin, panNum, aadharNum);
                break;
            case CURRENT:
                account = new CurrentAccount(id, name, address, phoneNum, balance, pin, panNum, aadharNum);
                break;
            case CREDIT:
                account = new CreditAccount(id, name, address, phoneNum, balance, pin, panNum, aadharNum);
                break;
            default:
                System.out.println("Invalid account type");
        }
        return account;
    }

}
