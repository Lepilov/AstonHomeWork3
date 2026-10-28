package chain;

public abstract class Authorization {
    protected Authorization next; // следующий в цепочке

    public void setNext(Authorization next) {
        this.next = next;
    }

    public abstract void check(String login, String password);
}
