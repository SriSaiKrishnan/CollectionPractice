/**
 * 
 */
package com.sai.arraylistdemo;

import java.util.ArrayList;

/**
 * @author sv
 *
 */
public class ArrayListSize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> iList = new ArrayList<Integer>();

		iList.add(100);
		iList.add(200);
		iList.add(400);
		
		System.out.print("Print the size of the array list" + "  " + iList.size());
		
	}

}
