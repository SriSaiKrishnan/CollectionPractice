/**
 * 
 */
package com.sai.hashset;

import java.util.LinkedHashSet;

/**
 * @author sv
 *
 */
public class LinkedHashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		lhs.add(10);
		lhs.add(20);
		lhs.add("String");
		lhs.add(3.888);
		lhs.add('c');
		
		System.out.println("In LinkedHashSet Insertion Order is Preserved");
		System.out.println(lhs);

	}

}
