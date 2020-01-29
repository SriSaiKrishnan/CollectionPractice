/**
 * 
 */
package com.sai.cursors;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author sv
 *
 */
public class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Object> hashset = new HashSet<Object>();
		hashset.add(10);
		hashset.add(20);
		hashset.add("String");
		hashset.add(30);
		hashset.add(40);
		System.out.println(hashset);

		Iterator<Object> itr = hashset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(hashset.isEmpty());
	}
}
