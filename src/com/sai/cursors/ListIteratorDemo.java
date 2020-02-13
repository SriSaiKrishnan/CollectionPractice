/**
 * 
 */
package com.sai.cursors;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author sv
 *
 */
public class ListIteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(40);
		al.add(50);
		al.add(60);
		
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(al);
		System.out.println(ll);
		
		ListIterator<Object> ltr = ll.listIterator();
		while(ltr.hasNext())
		{
			Integer i = (Integer) ltr.next();
			if(i.equals(10)) {
				System.out.println("The Number is 10");
			}
			else if(i.equals(50)) {
				ltr.remove();
			}
			else if(i.equals(20)) {
				ltr.set("Twenty");
			}
		}
		System.out.println(ll);
	}

}
