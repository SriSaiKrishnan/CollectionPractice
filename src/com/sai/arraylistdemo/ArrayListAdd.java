/**
 * 
 */
package com.sai.arraylistdemo;

import java.util.ArrayList;

/**
 * @author sv
 *
 */
public class ArrayListAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> iList = new ArrayList<Integer>();

		iList.add(100);
		iList.add(200);
		iList.add(400);

		System.out.println("Printing iList:" + iList);

		ArrayList<String> sList = new ArrayList<String>();

		sList.add("Hi There");
		sList.add("Hello");
		sList.add("Welcome");

		System.out.println("Printing isList:" + sList);

	}

}
