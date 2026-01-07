package oop.atmcard_project;

class  InsufficientFundsException extends Exception{
	
	InsufficientFundsException(){ 
		super();
	}

	InsufficientFundsException(String errMsg){ 
		super(errMsg); 
	} 

}