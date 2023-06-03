
public class BankAccount {
    private String accountNumber;
    private double balance;

   /* public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        System.out.println("this is account number.........."+accountNumber);
    }*/

    public void deposit(double amount) {
        // Perform validations, if any
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        // Perform validations, if any
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println(balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    /*public void setBalance(double balance) {
        this.balance = balance;
    }*/

    public static void main (String[] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100);
        bankAccount.withdraw(50);
        bankAccount.balance=80;
        System.out.println(bankAccount.getBalance());

    }
}

