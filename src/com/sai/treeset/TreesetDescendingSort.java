/**
 * Write a program to Insert Integer Object into Treeset where sorting order is descending
 */

package com.sai.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author sv
 *
 */
public class TreesetDescendingSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
		t.add(35);
		t.add(50);
		t.add(10);
		t.add(0);
		t.add(35);

		System.out.println(t);

	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 < i2) {
			return +1;
		} else if (i1 > i2) {
			return -1;
		} else
			return 0;
	}

}