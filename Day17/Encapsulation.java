class Account {
    private int balance;

    void setBalance(int b) {
        balance = b;
    }

    int getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.setBalance(5000);
        System.out.println(acc.getBalance());
    }
}