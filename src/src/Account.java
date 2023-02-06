package src;

public class Account{
	
private int accountNumber;
private String accountHolderName;
private double balance;



public int getaccountNumber() {
	return accountNumber;
}
public void setaccountNumber(int account) {
	this.accountNumber = account;
}



public String getaccountHolderName() {
	return accountHolderName;
}
public void setaccountHolderName(String accountName) {
	this.accountHolderName = accountName;
}



public double getbalance() {
	return balance;
}
public void setbalance(double balance) {
	this.balance = balance;
}


void deposit(double amount) {
	double total = amount + balance;
	System.out.println("deposit amount: " +total);
}

void withdraw(double withdraw) {
	if (withdraw > balance) {
		try {
			
		}catch(Exception e) {
			throw e;
		}
	}else {
		System.out.println("Withdrawal successfually");
	}
}





}
