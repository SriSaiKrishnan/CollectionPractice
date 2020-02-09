/**
 * Write a program to insert string objects into TreeSet where sorting order is Reverse of Alpha
 */

package com.sai.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t = new TreeSet<String>(new CompComp());
		t.add("Raja");
		t.add("Babu");
		t.add("Guru");
		t.add("Prasanth");
		t.add("Dinesh");
		System.out.println(t);
	}
}

class CompComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	}
}