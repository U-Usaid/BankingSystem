package src;
import java.util.*;
public class SavingsAccount extends Account {

Scanner sc = new Scanner(System.in);

double rate;
int time;

void intrest() {
	System.out.println("Enter Rate: ");
	rate = sc.nextDouble();
    System.out.println("Enter Time: ");
    time = sc.nextInt();
    
    double intrest = Main.balanceRemianing * rate * time;
    System.out.println("Intrest: "+ intrest );
}



}
