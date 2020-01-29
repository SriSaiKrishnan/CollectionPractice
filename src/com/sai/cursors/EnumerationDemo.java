/**
 * 
 */
package com.sai.cursors;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author sv
 *
 */
public class EnumerationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> vector = new Vector<Object>();
		for(int i=0;i<=10;i++) {
			vector.addElement(i);
		}
		System.out.println(vector);
		
		Enumeration<Object> enumeration = vector.elements();
		while(enumeration.hasMoreElements())
		{
			Integer i = (Integer) enumeration.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
