package lamdamcq;

@FunctionalInterface
interface NIT8
{
 int square(int x);
 default int add(int a, int b){
     return a+b;
 }
 default int sub(int a, int b){
     return a-b;
 }
 static int multiply(int a, int b){
     return a*b;
 }
 static int divide(int a, int b){
     return a/b;
 }
}
public class FunctionalInterfaceExample8 implements NIT8
{
 public static void main(String[] args){
     int a = 25;
     int b = 5;
     FunctionalInterfaceExample8 fun = new FunctionalInterfaceExample8();
     int add = fun.add(a,b);
     int sub = fun.sub(a,b);
     int mul = NIT8.multiply(a,b);
     int div = NIT8.divide(a,b);
     System.out.println(add+" "+sub+" "+mul+" "+div+" "+fun.square(6));
} 
 @Override
 public int square(int x) {
     return x*x;
 }
}