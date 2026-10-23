package chain;

public class PasswordCheck extends Authorization{
    @Override
    public void check(String login, String password) {
        if (password.equals("12345")){
            System.out.println("Пароль верный");
            if (next != null){
                next.check(login, password);
            }
        } else {
            System.out.println("Неверный пароль");
        }
    }
}
