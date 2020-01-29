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
public class ArrayListSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add(0);
		list.add("Hey");
		list.add(3.9876);

		System.out.println("Before updating" + "  " + list);

		list.set(1, 45);

		System.out.println("After Updating" + "  " + list);

	}

}
