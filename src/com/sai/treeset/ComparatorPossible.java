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
public class ComparatorPossible {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparatorDemo());
		System.out.println(t);

	}

}

class MyComparatorDemo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		System.out.println(i1.compareTo(i2));
		System.out.println(-i1.compareTo(i2));		
		System.out.println(i2.compareTo(i1));
		System.out.println(-i2.compareTo(i1));
		return 0;
	}
	
}
