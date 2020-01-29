/**
 * 
 */
package com.sai.linkedlistdemo;

import java.util.LinkedList;

/**
 * @author sv
 *
 */
public class AddFirstorLast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		list.add(2);
		list.add(8);
		list.addFirst("Hello");
		list.addLast("Last");
		list.add(9);
		list.add("last");
		
		System.out.println(list);
		
	}

}
