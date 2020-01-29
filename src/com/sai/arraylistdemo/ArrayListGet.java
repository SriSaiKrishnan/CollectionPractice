/**
 * 
 */
package com.sai.arraylistdemo;

import java.util.ArrayList;

/**
 * @author sv
 *
 */
public class ArrayListGet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Object> iList = new ArrayList<Object>();
		iList.add(10);
		iList.add(20);
		iList.add(30);
		iList.add(40);
		
		System.out.println("Retrive the element at index 2" + "  " + iList.get(2));

	}

}
