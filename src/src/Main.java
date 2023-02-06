package src;
import java.util.*;
public class Main {

	public static double balanceRemianing;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account myAccount = new Account();
		SavingsAccount mySaving = new SavingsAccount();
		CheckingAccount myChecking = new CheckingAccount();
		
		System.out.println("Enter Deposit Amount:");
		double deposit = sc.nextDouble();
        myAccount.deposit(deposit);
        
        System.out.println("Enter Amout to withdraw: ");
        double withdraw = sc.nextDouble();
        myAccount.withdraw(withdraw);
        
        balanceRemianing = deposit - withdraw;
        System.out.println("your balance now: " + balanceRemianing);
        

        mySaving.intrest();
        
        System.out.println("Enter Limited withdraw amount: ");
        double limit = sc.nextDouble();
        myChecking.withdraw(limit);
		
		
	}

}
