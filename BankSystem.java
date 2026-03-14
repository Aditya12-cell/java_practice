// Bank account
import java.util.Scanner;

class BankAccount {
    double principal;
    double rate;    
    double time;

    void getData(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
} 
// child class 1
class SavingsAccount extends BankAccount {
    SavingsAccount(){
        rate = 4; // 4% interest
    }
}
// child class 2
class CurrentAccount extends BankAccount {
    CurrentAccount(){
        rate = 2; // 2% interest
    }
}
//child class 3
class FixedDepositAccount extends BankAccount {
    FixedDepositAccount(){
        rate = 6; // 6% interest
    }
}
// main class
public class BankSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();
//savings account
        SavingsAccount savings = new SavingsAccount();
        savings.getData(principal, savings.rate, time);
        System.out.println("Interest for Savings Account: " + savings.calculateInterest());
//current account
        CurrentAccount current = new CurrentAccount();
        current.getData(principal, current.rate, time);
        System.out.println("Interest for Current Account: " + current.calculateInterest());
//fixed deposit account
        FixedDepositAccount fixedDeposit = new FixedDepositAccount();
        fixedDeposit.getData(principal, fixedDeposit.rate, time);
        System.out.println("Interest for Fixed Deposit Account: " + fixedDeposit.calculateInterest());
     sc.close();
    }
}

