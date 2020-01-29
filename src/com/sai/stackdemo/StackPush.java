/**
 * 
 */
package com.sai.stackdemo;

import java.util.Stack;

/**
 * @author sv
 *
 */
public class StackPush {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stack<Object> stack = new Stack<Object>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push("Hello");
		stack.push(4.98);
		
		System.out.println("Prining the element in stack" + stack);

	}

}
