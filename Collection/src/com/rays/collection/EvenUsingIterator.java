package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenUsingIterator {
	public static void main(String[] args) {
		List l = new ArrayList();
		for (int i = 0; i < 10; i++) {
			l.add(i);
		}
		System.out.println("Total number " + l);

		Iterator it = l.iterator();
		while (it.hasNext()) {
			int num = (int) it.next();

			if (num % 2 == 0) {
				System.out.println(num);
			}
	      it.remove();
		}
		
	}
	
}
