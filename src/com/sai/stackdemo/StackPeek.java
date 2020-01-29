/**
 * 
 */
package com.sai.stackdemo;

import java.util.Stack;

/**
 * @author sv
 *
 */
public class StackPeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Object> stack = new Stack<Object>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Printing all element in stack" + stack);
		
		stack.peek();
		
		System.out.println("Printing the element after performing peek operation" + stack);
		

	}

}
