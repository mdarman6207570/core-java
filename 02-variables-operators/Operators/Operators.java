package day_16__Operators;

public class Operators 
{

	public static void main(String[] args) 
	{
        byte b = 127;
        byte c = 127;
        //byte d = b+c;  //error  out of range
        
        short s =12;
        short t = 14;
      //  short u = s-t;  //error int type need 32bit
     
        
        byte a = 2;
      //  byte d = -a;   //error
        
        byte d = 1;
      //  b = b +2;  //error int type
  
        b +=2;  //valid   because short hand property                            
            
	}

}
