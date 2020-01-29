/**
 * 
 */
package com.sai.arraylistdemo;

import java.util.ArrayList;

/**
 * @author sv
 *
 */
public class ArrayListIndexOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Hello");
		aList.add("There");
		aList.add("I am Using Eclipse");

		System.out.println("Return index of the  string There" + " : " + aList.indexOf("There"));

	}

}
