/**
 * 
 */
package com.sai.hashmapdemo;

import java.util.WeakHashMap;

/**
 * @author sv
 *
 */
public class WeakHashMapDemo {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "Sai");
		System.out.println(m);
		m = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}

}

class Temp {
	public String toString() {
		return "temp";
	}

	public void finalize() {
		System.out.println("Finalize Method  Called");
	}
}