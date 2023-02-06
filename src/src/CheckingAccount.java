package src;

public class CheckingAccount extends Account{
int limit = 300;	
	
	@Override
	void withdraw(double amount) {
		if (limit <= amount) {
			try {
				
			}catch(Exception e) {
				throw e;
			}
		}else {
			System.out.println("Withdrawal successfually");
		}
}
	
	
}

