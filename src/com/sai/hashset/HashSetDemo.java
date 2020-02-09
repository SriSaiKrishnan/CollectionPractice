/**
 * 
 */
package com.sai.hashset;

import java.util.HashSet;

/**
 * @author sv
 *
 */
public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Hey");
		hs.add("Hi");
		System.out.println(hs.add("Hey"));
		hs.add(null);
		System.out.println("In HashSet Insertion Order is Preserved");
		System.out.println(hs);

	}
}
