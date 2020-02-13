/**
 * 
 */
package com.sai.vectordemo;

import java.util.Vector;

/**
 * @author sv
 *
 */
public class VectorAddElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Object> vector = new Vector<Object>();
		vector.addElement(10);
		vector.addElement("Hello");
		vector.addElement(5.87);
		vector.addElement('C');
		
		System.out.println("Printing the Element in Vector" + vector);
		
	}

}
