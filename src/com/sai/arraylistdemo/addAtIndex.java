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
public class addAtIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(100);
		iList.add(200);
		iList.add(300);
		
		//add element at 2nd index
		iList.add(1, 400);

		System.out.println(iList);
		
		List<String> sList = new ArrayList<String>();
		
		sList.add("Hi");
		sList.add("Hello");
		sList.add("How are You !!");
		
		//add element at 2nd Index
		sList.add(1, "There");
		
		System.out.println(sList);

	}

}
