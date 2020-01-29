/**
 * 
 */
package com.sai.arraylistdemo;

import java.util.ArrayList;

/**
 * @author sv
 *
 */
public class ArrayListRemove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10);
		aList.add(20);
		aList.add(30);
		aList.add(40);

		aList.remove(2);

		System.out.println("After Removing the element at index 2" + aList);

		aList.removeAll(aList);

		System.out.println("After removing all element in the list" + aList);

	}

}
