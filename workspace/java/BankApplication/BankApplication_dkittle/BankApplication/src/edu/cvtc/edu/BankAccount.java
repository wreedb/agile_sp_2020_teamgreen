/**
 * 
 */
package edu.cvtc.edu;

/**
 * @author david.kittle
 *
 */
public class BankAccount {
	// Variables 
	private Double balance; 
	private Double MIN_BALANCE = 0.0;

	//Default Constructor 
	public BankAccount() {
		
	}
	// Overloaded
	public BankAccount(Double balance) {
		this.balance = balance;
		
	}
	// Getters and Setters 
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	// what do I put in these
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		balance -= amount;
	}
	
	// toString - what does this produce 
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", MIN_BALANCE=" + MIN_BALANCE + "]";
	}
	
	

}
