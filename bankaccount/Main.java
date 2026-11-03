package bankaccount;

public class Main {
    public static void main(String[] args) {

        BankAccount b = new BankAccount(12345, 5000);

        b.display();

        b.deposit(2000);
        b.withdraw(1000);

        System.out.println("Final Balance: " + b.getBalance());
    }
}