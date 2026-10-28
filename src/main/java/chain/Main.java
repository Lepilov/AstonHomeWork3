package chain;

public class Main {
    public static void main(String[] args) {
        Authorization account = new AccountCheck();
        Authorization password = new PasswordCheck();

        account.setNext(password);
        account.check("admin", "12345");
        account.check("admin", "123");
        account.check("user", "12345");
    }
}
