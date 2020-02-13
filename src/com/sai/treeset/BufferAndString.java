/**
 * 
 */
package com.sai.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author sv
 *
 */
public class BufferAndString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new BuffString());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("ABCD"));
		t.add("AA");
		t.add("A");
		System.out.println(t);
	}

}
class BuffString implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		Integer i1 = s1.length();
		Integer i2 = s2.length();
		if(i1>i2) {
			return +1;
		}else if(i1<i2) {
			return -1;
		}else
		return s1.compareTo(s2);
	}
	
}