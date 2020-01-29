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
public class clearArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Float> iList = new ArrayList<Float>();
		iList.add((float) 3.833);
		iList.add((float) 4.874);
		iList.add((float) 9.944);

		System.out.println("Printing the size of the ArrayList" + iList.size());

		iList.clear();

		System.out.println("After clearing the ArrayList" + iList.size());
	}

}
