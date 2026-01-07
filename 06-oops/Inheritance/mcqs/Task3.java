package DAY43_Inheritance_Mcq;

class Task3 
{ 
public static void main(String[] args) 
{ 
	new U(); 
    new U(1); 
    new V(); 
    new V(1); 
    new T(); 
    new T(1); 
} 
} 
class U { 
V v = new V(); 
U() 
{ 
System.out.print("U"); 
} 
U(int i) 
{ 
System.out.print("u"); 
} 
} 
class V 
{ 
V() 
{ 
System.out.print("V"); 
} 
V(int i) 
{ 
System.out.print("v"); 
} 
} 
class T extends V 
{ 
T() 
{ 
System.out.print("T"); 
} 
T(int i) 
{ 
System.out.print("t"); 
} 
} 
