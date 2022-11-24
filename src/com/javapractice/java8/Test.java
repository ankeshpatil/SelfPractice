package com.javapractice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test implements Cloneable {
	public static void main(String[] args) {
		X x = new Y();
		X x1 = new X();
		Y y = new Y();
		x.getAdd();
		x.get();
		// System.out.println(y.a);
		
		
		
//		Test t=new Test();
//		System.out.println(t.hashCode());
//		try {
//			Test t1=(Test) t.clone();
//			System.out.println(((Object) t1).hashCode());
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		List<Integer> li = new ArrayList<Integer>();
		li.add(3);
		li.add(8);
		li.add(2);
		li.add(9);
		li.add(4);
		li.add(6);

//		public boolean test(args);
//
		List<Integer> l2 = li.stream().map(e -> {
			if(e % 2 == 0)
			return e;
			else
				return 0;
			
		}).collect(Collectors.toList());
		l2.forEach(System.out::println);

//		Predicate<Integer> p = (e) -> e % 2 == 0;
//		for (Integer s : li) {
//
//			if (p.test(s)) {
//				System.out.println(s);
//			}
//		}

		// public int apply(int a);
List <Integer> lii=new ArrayList<Integer>();
		Function <Integer,Boolean> f=(a)-> a%2==0;
		for(Integer s:li) {
		if(f.apply(s)) {
			lii.add(s);
		}
		
			
			
		}System.out.println(lii);
		
//		

	}
}