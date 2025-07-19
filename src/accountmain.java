class account {
    private double balance;

    // Default constructor
    public account   () {
        balance = 0.0;
    }

    // Parameterized constructor
    public account (double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

}

// AccountMain.java
  public class AccountMain  {
      public static void main(String[] args) {
          // Using default constructor
        account acc1 = new account();
          acc1.deposit(1000);
        acc1.withdraw(200);
        acc1.displayBalance();

        System.out.println();

        // Using parameterized constructor
         account acc2 = new account(5000);
         acc2.deposit(1500);
         acc2.withdraw(3000);
         acc2.displayBalance();
      }
  }
