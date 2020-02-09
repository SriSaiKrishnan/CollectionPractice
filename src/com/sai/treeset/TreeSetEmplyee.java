package com.sai.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEmplyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Nag", 100);
		Employee e2 = new Employee("Venki", 300);
		Employee e3 = new Employee("Chiru", 400);
		Employee e4 = new Employee("Rajni", 500);
		Employee e5 = new Employee("Nag", 100);

		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);

		System.out.println(t);

		TreeSet t1 = new TreeSet(new Comp());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);

		System.out.println(t1);
	}

}

class Employee implements Comparable {

	String name;
	int id;

	Employee(String name, int id) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return name + "--" + id;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int eid = this.id;
		Employee e = (Employee) o;
		int eid2 = e.id;
		if (eid > eid2) {
			return +1;
		} else if (eid < eid2) {
			return -1;
		} else
			return 0;
	}

}

class Comp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}

}