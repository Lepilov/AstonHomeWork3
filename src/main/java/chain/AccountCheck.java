package chain;

public class AccountCheck extends Authorization{
    @Override
    public void check(String login, String password) {
        if (login.equals("admin")){
            System.out.println("Доступ разрешен " + login);
            if (next != null){
                next.check(login, password);
            }
        } else {
            System.out.println("Доступ запрещен " + login);
        }
    }
}
