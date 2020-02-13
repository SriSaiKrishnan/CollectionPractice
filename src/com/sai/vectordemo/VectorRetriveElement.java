/**
 * 
 */
package com.sai.vectordemo;

import java.util.Vector;

/**
 * @author sv
 *
 */
public class VectorRetriveElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Object> vector = new Vector<Object>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add("Hello");
		vector.add("Hey");
		vector.add('C');
		vector.add(6.987);

		System.out.println(vector);

		System.out.println("Retrive first element" + vector.firstElement());

		System.out.println("Retrive Last Element" + vector.lastElement());

		System.out.println("Retrive element at index" + vector.elementAt(4));

	}

}
