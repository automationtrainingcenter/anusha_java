package bankdemo;

public class AccountFactory {

    public static Account createAccount(AccountType accType, int id, String name, String address, String phoneNum, double balance, int pin, String panNum, long aadharNum) {
        switch (accType) {
            case SAVINGS:
                // create savings account class object
                break;
            case CURRENT:
                // Create current account class object
                break;
            case CREDIT:
                // Create credit account class object
                break;
            default:
                System.out.println("Invalid account type");
        }
        return null;
    }

}
