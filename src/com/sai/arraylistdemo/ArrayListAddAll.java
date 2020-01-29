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
public class ArrayListAddAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> iList1 = new ArrayList<Object>();
		iList1.add(10);
		iList1.add(20);
		iList1.add(30);
		iList1.add("Zakir");

		System.out.println("Printing iList1:" + iList1);

		ArrayList<String> iList2 = new ArrayList<String>();
		iList2.add("40");
		iList2.add("50");
		iList2.add("60");

		System.out.println("Printing iList2" + iList2);

		iList1.addAll(iList2);

		System.out.println("Printing iList1:" + iList1);

	}

}
