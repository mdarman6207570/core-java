package oop.atmcard_project;

public class  NegativeAmountException extends Exception {
	
	NegativeAmountException(){ 
		super();
	}
	
	NegativeAmountException(String errMsg){ 
		super(errMsg); 
	} 

}