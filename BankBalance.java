import java.util.Scanner;
//custom exception
 class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
    
}
public class BankBalance {
    static double balance = 0;
    //throws
    public static void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
    static void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while(true){
        System.out.println("\\n1. Deposit\n2.withdraw\n3.check balance\n4.exit");
        System.out.print("Enter your choice: ");
       
        
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
}
