/**
 * 
 */
package com.sai.treemapdemo;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author sv
 *
 */
public class TreeMapCSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap t = new TreeMap(new Com());
		t.put("Sai", 100);
		t.put("Ariv", 200);
		t.put("Zakir", 300);
		t.put("Krishnan", 400);
		System.out.println(t);
	}

}

class Com implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = (String) o1;
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}

}