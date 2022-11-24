package com.javapractice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPI {
	
	public static void main(String[] args) {
		
		//To remove duplicates from String
		String as="Happy";
		
//		String z=Arrays.asList(as.split("")).stream().distinct().collect(Collectors.joining());
//		System.out.println(z);
		

				
				
	List <Integer> al=new ArrayList<Integer>();
		al.add(15);
		al.add(6);
		al.add(14);
		al.add(32);
		al.add(18);
		
		//filter(Predicate<> pr) ==>It is used to filter the collection based on some condition..
		
		// To get even number from the List
		
//		List<Integer> list=al.stream().filter(i->(i % 2==0)).collect(Collectors.toList());
//        list.forEach(System.out::println);
        
      //If I want to add 5 to even numbers only
		
//        List <Integer> list=al.stream().filter(i->(i%2==0)).map(i->i+5).collect(Collectors.toList());
//		list.forEach(System.out::println);
	
		//map(Function<> fun)=>It is used to create/update a new object using existing one
		
		
		 //If I want to add 5 to each numbers
		
//		List <Integer> list=al.stream().map(i->i+5).collect(Collectors.toList());
//		list.forEach(System.out::println);
		
		//Sort a List in natural order-Ascending
		
//		List<Integer> list=al.stream().sorted().collect(Collectors.toList());
//		list.forEach(System.out::println);
		
		//How many ->Even number and greater then 10
		
//		long count=al.stream().filter(i->(i%2==0)).filter(i->(i>10)).count();
//		System.out.println("Total even number greater than 10 are "+(count)+" and they are as following ->");
//		
//		List<Integer> list=al.stream().filter(i->(i%2==0)).filter(i->(i>10)).collect(Collectors.toList());
//		list.forEach(System.out::println);
		
		//Sort a List in Descending
		
//		List<Integer> list=al.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
//		list.forEach(System.out::println);
		
		//To get max/min number from list
		
//		int num =al.stream().max((s1,s2)->s1.compareTo(s2)).get();
//		System.out.println("The max number is :  "+num); //32
//		int num =al.stream().max((s1,s2)->-s1.compareTo(s2)).get();
//     	System.out.println("The max number is :  "+num);//6
		
		
//		int num1=al.stream().min((s1,s2)->s1.compareTo(s2)).get();
//		System.out.println("The min number is :  "+num1);//6
//		int num1=al.stream().min((s1,s2)->-s1.compareTo(s2)).get();
//		System.out.println("The min number is :  "+num1);//32
		
		
//		List<String> all=new ArrayList<String>();
//		all.add("Pune");
//		all.add("Mumbai");
//		all.add("Nagapur");
//		all.add("Delhi");
//		all.add("Buldhana");
	
		//String sorting in Descending
		
//	List <String> list=all.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
//	list.forEach(e->{System.out.println("Element : " +e);});
		
		//Alphabetically least string
		
//		String s=all.stream().min((s1,s2)->s1.compareTo(s2)).get();
//		System.out.println(s);
	
	   //Ascending ordered
		
//		List<String> list =all.stream().sorted().collect(Collectors.toList());
//		list.forEach(e->{
//			System.out.println("elements are : "+e);
//		});
		
		List <Employee> list=new ArrayList<Employee>();
		list.add(new Employee("Akshay",19000));
		list.add(new Employee("Sourabh",21000));
		
		list.add(new Employee("Vish",15000));
		list.add(new Employee("Ketan",15000));
		list.add(new Employee("Harsh",15000));
		list.add(new Employee("Rupali",22000));
		
		//Get all the name of employee in list
		
//	    List<String> list2= list.stream().map(Employee::getName).collect(Collectors.toList());
//		list2.forEach(System.out::println);
		
		//Sorting on the basis of name Ascending
//		
//		List<Employee> li=list.stream().sorted((a,b)->((a.getName()).compareTo(b.getName()))).collect(Collectors.toList());
//		li.forEach(System.out::println);
		
		//Sorting on the basis of Salary
		
//		list.stream().sorted((a,b)->(b.getSalary())-(a.getSalary())).map(e->e.getSalary()).forEach(System.out::println);

		
		//Sort emp salary greater than 20000 and add 10000 in the filtered salary
		
//		list.stream().filter(e->(e.getSalary()>20000)).map(e->(e.getSalary()+10000)).forEach(System.out::println);
		
		//get emp name in sorted order whose salary is greater than 20000
		
//		list.stream().sorted((a,b)->(a.getName()).compareTo(b.getName())).filter(e->(e.getSalary())>20000).map(Employee::getName).forEach(System.out::println);
		
		//Employee salary increase by 30%
		
//		List <Employee> li=list.stream().filter(e->(e.getSalary()<25000)).map(e->{e.setSalary((int) (e.getSalary()*1.3));return e;}).collect(Collectors.toList());
//		li.forEach(System.out::println);
		
		List<String> all=new ArrayList<String>();
		all.add("aaa");
		all.add("cda");
		all.add("abc");
		all.add("cma");
		all.add("aln");
		
//List <String> liii=all.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
//liii.forEach(e->{System.out.println("elemnts are  "+e);});
//	
//	Predicate<String> p=e->e.startsWith("a");
//	for(String x:all)
//	{
//		if(p.test(x)) System.out.println(x);
//	}
//
//	
	
	
	
 List <Integer> ai=new ArrayList<Integer>();
 ai.add(2);
 ai.add(4);
 ai.add(5);
 ai.add(2);
 ai.add(2);
 ai.add(4);
 //Remove Duplicates Passing into Hashset
 
// Set<Integer> s=new HashSet();
//List<Integer>ak=ai.stream().filter(e->!s.add(e)).collect(Collectors.toList());
//System.out.println(ak);

//Remove Duplicates using Distinct method

// List<Integer>ak=ai.stream().distinct().collect(Collectors.toList());
// System.out.println(ak);

//In map getting duplicates occurance in the form of key value pair and printing duplicate element key 

// ai.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
// .entrySet().stream().filter(e->e.getValue() >1).map(Map.Entry::getKey).forEach(System.out::println);

 //Printing occurrance of value in key pair

//ai.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//.forEach((K,V)->System.out.println(K+" : "+V));

//Comparator <Employee>cm=(a,b)->(b.getSalary()-a.getSalary());
//Collections.sort(list,cm);
//list.forEach(System.out::println);

 //sort salary and duplicate salary emp name should be sorted in order
//Comparator<Employee> comp=(o1,o2)->(o1.getSalary()>o2.getSalary())? -1 :(o1.getSalary()<o2.getSalary())? 1 : o2.getName().compareTo(o1.getName());
//Collections.sort(list, comp);
//list.forEach(System.out::println);
	}
}
