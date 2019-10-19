/**
 * 
 */
package edu.cvtc.java;

/**
 * @author david.kittle
 *
 */
public class Employee {
	
	// Vairables 
	private String employeeName; 
	private String employeeNumber; 
	private String employeeHireDate;
	

	// Default Constructors 
	public Employee() {
		
	}
	
	// Overloaded 
	public Employee(String employeeName, String employeeNumber, String employeeHireDate) {
		super();
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
		this.employeeHireDate = employeeHireDate;
	}
	
	
	// Getters and setters 
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	
	public void setEmployeeNumber(String employeeNumber) {
		if(isValidNum(employeeNumber)){
			this.employeeNumber = employeeNumber;
		} else {
			this.employeeNumber = "Invalid Employee Number";
		}
		
	}
	
	public String getEmployeeHireDate() {
		return employeeHireDate;
	}
	
	public void setEmployeeHireDate(String employeeHireDate) {
		this.employeeHireDate = employeeHireDate;
	} 
	
	private static boolean isValidNum(String employeeNumber) {
		boolean isValid = true;
		int index = 0; 
		// check the length
		if (employeeNumber.length() != 5) {
			isValid = false;
		}
		
		// check  the first 3 digit 
		while(isValid && index < 3) {
			if(!Character.isDigit(employeeNumber.charAt(index))) {
				isValid = false;
			}
			index++; 
		}
		
		// check if the fourth character is a dash 
		if(employeeNumber.substring(3, 4).equals("-")){
			index++;			
		} else {
			isValid = false;
		}
		 

		
		// check the last character for letter
		while(isValid && index < 5) {
			if(!Character.isLetter(employeeNumber.charAt(index)) || (!Character.isUpperCase(employeeNumber.charAt(index)))){
				isValid = false; 
			}
			index++; 
		}
			
		return isValid;
			
	}
	

	
	
}

