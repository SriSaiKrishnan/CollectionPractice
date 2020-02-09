/**
 * 
 */
package com.sai.queuedemo;

import java.util.PriorityQueue;

/**
 * @author sv
 *
 */
public class PriorityQueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue q = new PriorityQueue();
		System.out.println(q.peek());
		//System.out.println(q.element()); //NSEE
		for(int i=0; i<=10; i++) {
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}

}
