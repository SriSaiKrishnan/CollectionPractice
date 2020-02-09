/**
 * 
 */
package com.sai.hashmapdemo;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * @author sv
 *
 */
public class IdentityHashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		m.put(i1, "Sai");
		m.put(i2, "Krishnan");
		System.out.println(m);
	}

}
