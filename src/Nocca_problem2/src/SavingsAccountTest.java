import java.lang.Math;
public class SavingsAccountTest {
	
	public static SavingsAccount saver1 = new SavingsAccount(2000);
	public static SavingsAccount saver2 = new SavingsAccount(3000);
	
	public static void printInterest() {
		saver1.calcualteMonthlyInterest();
		saver2.calcualteMonthlyInterest();
	}
	
	public static void changeInterest(double NewInterestRate) {
		saver1.modifyInterestRate(NewInterestRate);
		saver1.modifyInterestRate(NewInterestRate);
	}
	
	public static void MonthTwo() {
		double NewInterestRate= 0.05;
		changeInterest(NewInterestRate);
		System.out.println("Month two:");
		printInterest();
	}
	
	public static void MonthOne() {
		System.out.println("Month one:");
		printInterest();
	}
	public static void main(String[] args) {
		MonthOne();
		MonthTwo();
	
	}
	
}
