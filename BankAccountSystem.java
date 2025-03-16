class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}


class FixedDepositAccount extends BankAccount {
    private int depositTerm;

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}


public class BankAccountSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 5000, 3.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 3000, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 10000, 12);

        savings.displayAccountInfo();
        savings.displayAccountType();

        checking.displayAccountInfo();
        checking.displayAccountType();

        fixedDeposit.displayAccountInfo();
        fixedDeposit.displayAccountType();

//        Account Number: SA12345
//        Balance: $5000.0
//        Account Type: Savings Account
//        Interest Rate: 3.5%
//        Account Number: CA67890
//        Balance: $3000.0
//        Account Type: Checking Account
//        Withdrawal Limit: $1000.0
//        Account Number: FD11223
//        Balance: $10000.0
//        Account Type: Fixed Deposit Account
//        Deposit Term: 12 months
    }
}
