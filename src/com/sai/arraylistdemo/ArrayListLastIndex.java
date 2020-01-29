/**
 * 
 */
package com.sai.arraylistdemo;

import java.util.ArrayList;

/**
 * @author sv
 *
 */
public class ArrayListLastIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<String>();
		sList.add("Hey");
		sList.add("There");
		sList.add("How are you");
		sList.add("Hey");

		System.out.println("Last index of Hey" + " : " + sList.lastIndexOf("Hey"));

	}

}
