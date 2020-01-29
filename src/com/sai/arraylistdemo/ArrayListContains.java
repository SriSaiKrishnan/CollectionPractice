/**
 * 
 */
package com.sai.arraylistdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sv
 *
 */
public class ArrayListContains {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> oList = new ArrayList<Object>();
		oList.add(10);
		oList.add("Hello");
		oList.add(4.97);

		boolean list1 = oList.contains(10);

		if (list1) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element Not Present");
		}

	}

}
