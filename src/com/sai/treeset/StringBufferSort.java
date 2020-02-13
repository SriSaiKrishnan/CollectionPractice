/**
 * Write a program to insert string Buffer objects into the TreeSet where string order is alphabetical
 * 
 */
package com.sai.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author sv
 *
 */
public class StringBufferSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<StringBuffer> t = new TreeSet<StringBuffer>(new BufferString());
		t.add(new StringBuffer("Hello"));
		t.add(new StringBuffer("Vanakam"));
		t.add(new StringBuffer("Namaskar"));
		t.add(new StringBuffer("Vandhanam"));
		System.out.println(t);
	}

}
class BufferString implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);	
	}
	
}