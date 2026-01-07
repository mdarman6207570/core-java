package DAY43_Inheritance_Mcq;

class Task4 
{ 
public static void main(String[] args) 
{ 
new Parnt(); 
new Base(); 
} 
} 
class Parnt extends Base 
{ 
Parnt() 
{ 
System.out.print("Base"); 
} 
} 
class Base 
{ 
Base() 
{ 
System.out.println("Base"); 
} 
} 