public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to $0.");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(" Deposit failed: Amount must be positive.");
        } else {
            balance += amount;
            System.out.println(" Deposited $" + amount + " successfully.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Withdrawal failed: Amount must be positive.");
        } else if (amount > balance) {
            System.out.println(" Withdrawal failed: Insufficient balance (Overdraft not allowed).");
        } else {
            balance -= amount;
            System.out.println(" Withdrew $" + amount + " successfully.");
        }
    }

    public void printBalance() {
        System.out.printf(" Current Balance for %s: $%.2f\n", accountHolder, balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.0);

        account.printBalance();

        account.deposit(500.0);     
        account.withdraw(200.0);      
        account.withdraw(1500.0);     
        account.deposit(-50.0);       
        account.withdraw(-20.0);      

        account.printBalance();
    }
}
