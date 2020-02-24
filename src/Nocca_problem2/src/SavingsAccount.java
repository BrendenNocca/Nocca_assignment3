public class SavingsAccount {
	private double savingsBalance;
	public  double interestRate;
	
	public SavingsAccount(double savingsBalance) {
		setSavingsAccount(savingsBalance);
		this.interestRate=0.04;
	}
	
	public void setSavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	
	public void calcualteMonthlyInterest() {
		
		double savingsBalance =getSavingsBalance();
		double interestRate = getInterestRate();
		double monthlyInterest = (savingsBalance * interestRate) / 12;
		savingsBalance = monthlyInterest + savingsBalance;
		setSavingsAccount(savingsBalance);
		printMonthlyInterest(savingsBalance);
	}
	public void printMonthlyInterest(double monthlyInterest) {
		double rounededInterest = Math.round(monthlyInterest*100)/100;
		System.out.println("Your monthly interest is"+rounededInterest +" ");
	}
	
	
	public void modifyInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
