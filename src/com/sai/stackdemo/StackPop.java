/**
 * 
 */
package com.sai.stackdemo;

import java.util.Stack;

/**
 * @author sv
 *
 */
public class StackPop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Printing all element in stack" + stack);
		
		stack.pop();
		
		System.out.println("Printing the element after performing pop operation" + stack);
		
		
	}

}
