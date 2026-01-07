package day_56_Overriding__MCQ;

class Parent4 {
    int x = 100;

    Parent4() {
        System.out.println("Parent constructor, x = " + x);
        show();
    }

    void show() {
        System.out.println("Parent show");
    }
}

class Child4 extends Parent4 {
    int x = 200;

    Child4() {
        System.out.println("Child constructor, x = " + x);
    }

    @Override
    void show() {
        System.out.println("Child show, x = " + x);
    }
}

public class Test14 
{
	public static void main(String[] args) {
        new Child4();
    }
}
