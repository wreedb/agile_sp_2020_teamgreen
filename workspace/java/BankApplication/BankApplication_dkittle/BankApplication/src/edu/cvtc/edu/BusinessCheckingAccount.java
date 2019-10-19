/**
 * 
 */
package edu.cvtc.edu;

/**
 * @author david.kittle
 *
 */
public class BusinessCheckingAccount extends BankAccount{
	// Variables 
	private Double MIN_BALANCE = 1000.0; 
	

	// Constructor  
	public BusinessCheckingAccount(Double balance) {
		super(balance);

	}
	
	// Not Sure What Goes here
	public void withdraw(Double amount) {
		Double balance = getBalance();
		if ((balance - amount) < MIN_BALANCE) {
			System.out.println("NSF - BusinessCheckingAccount"); 
		} else {
			balance -= amount;
			System.out.println("Withdraw amount " + amount + " from BusinessCheckingAccount ");
		}
		
	}

	@Override
	public String toString() {
		return "BusinessCheckingAccount [MIN_BALANCE=" + MIN_BALANCE + "]";
	}
	
	
	
	
}
 