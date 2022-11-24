package com.javapractice.factorydesign;

import java.util.Scanner;
/*
 * Factory Design pattern
 */
public class Test {
	public static void main(String[] args) {
		ShapeDesign sd=new ShapeDesign();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your shape choice");
		String in=scanner.next();
		Shape s=sd.getshape(in);
		s.draw();
		
	}

}
