package bankdemo;

public class TestAccount {

    public static void main(String[] args) {
        Account obj = AccountFactory.createAccount(AccountType.CREDIT, 101, "Anusha", "Hyderabad", "9876543210", 100000.00, 1234, "asdf2345g", 0 );
        System.out.println(obj);

//        System.out.println(obj.getBalance());
//        obj.setAddress("London");
//        obj.deposite(-5000);
//        System.out.println(obj);
//        obj.withdraw(10000);
//        System.out.println(obj);
//        obj.setPhoneNum("8889912345");
//        obj.forgotPin();

        obj.withdraw(15000);
        System.out.println(obj);
        obj.withdraw(10000);
        System.out.println(obj);
        obj.withdraw(15000);
        System.out.println(obj);
        obj.deposite(15000);
        System.out.println(obj);
    }
}
