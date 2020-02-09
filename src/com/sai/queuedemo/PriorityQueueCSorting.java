/**
 * 
 */
package com.sai.queuedemo;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author sv
 *
 */
public class PriorityQueueCSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue q = new PriorityQueue(new Co());
		q.offer("XXX");
		q.offer("ABVC");
		q.offer("UYTR");
		q.offer("sdfg");
		System.out.println(q);
	}

}

class Co implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareToIgnoreCase(s1);
	}

}