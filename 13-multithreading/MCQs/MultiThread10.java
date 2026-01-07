package mcq;

public class MultiThread10 extends Thread 
{ 
public static void main(String[] args) { 
MultiThread10 m1 = new MultiThread10(); 
MultiThread10 m2 = new MultiThread10(); 
MultiThread10 m3 = new MultiThread10(); 
m1.start(); 
m2.start(); 
m3.start(); 
} 
public void run() { 
System.out.println(Thread.currentThread().getName()); 
} 
}