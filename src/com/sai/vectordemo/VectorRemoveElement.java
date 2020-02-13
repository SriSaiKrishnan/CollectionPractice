/**
 * 
 */
package com.sai.vectordemo;

import java.util.Vector;

/**
 * @author sv
 *
 */
public class VectorRemoveElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Object> vector = new Vector<Object>();
		vector.addElement(10);
		vector.addElement("Hey There !!");
		vector.addElement(6.987);
		vector.addElement('1');

		vector.removeElement("Hey There !!");

		System.out.println("Removing the Element" + vector);

		vector.removeElementAt(0);

		System.out.println("Removing the Element" + vector);

		vector.removeAllElements();

		System.out.println("Removing the Element" + vector);

	}

}
