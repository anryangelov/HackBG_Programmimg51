package com.hackbulgaria.programming51.week5;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		for (int i = 10; i < 20; i++) {
			l.add(i);
		}
		
		//l.set(0, 100);
		//l.insert(2, 21);
		//l.insert(10, 200 );
		//l.add(-1);
		l.remove(9);
		l.add(3);
		//l.insert(0, 5);
		System.out.println(l);
		
		System.out.println(l.get(4));
	}
}
