/**
 * 
 */
package com.sai.hashmapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author sv
 *
 */
public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map m = new HashMap();
		m.put(100, "Sai");
		m.put(500, "Krishnan");
		m.put(300, "Ariv");
		m.put(200, "Zakir");
		System.out.println(m);

		Set s1 = m.keySet();
		System.out.println(s1);

		Collection c = m.values();
		System.out.println(c);

		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "---" + m1.getValue());
			if (m1.getKey().equals(100)) {
				m1.setValue("Arivazhagan");
			}
		}
		System.out.println(m);
	}

}
