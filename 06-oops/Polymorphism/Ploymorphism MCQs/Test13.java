package day_56_Overriding__MCQ;

class Parent3 {
	
    Parent3() {
        print();
    }
    static void print() {
        System.out.println("Parent static print");
    }
}

class Child3 extends Parent3 {
    static void print() {
        System.out.println("Child static print");
    }
}

public class Test13 
{
	public static void main(String[] args) {
        new Child3();
    }
}
