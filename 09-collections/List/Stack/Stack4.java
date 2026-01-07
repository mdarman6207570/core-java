package stack;

import java.util.Stack;

public class Stack4 
{
	public static void main(String[] args) 
	{
		Stack<String> stk = new Stack<>();
		stk.push("Apple");
		stk.push("Grapes");
		stk.push("Mango");
		
		System.out.println("Offset Position is :"+stk.search("Mango"));
		System.out.println("Offset Position is :"+stk.search("Banana"));
		System.out.println("Is Stack Empty ? :"+stk.empty());
		
		System.out.println("Index Position is :"+stk.indexOf("Mango"));
		
	}

}
