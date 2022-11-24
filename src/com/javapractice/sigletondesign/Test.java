package com.javapractice.sigletondesign;

public class Test implements Cloneable{
	public static void main(String[] args) {
		Singleton s=Singleton.getObject();
		// s=new Singleton(); //Not Visible 
		//Object s1=s.clone();//Clone not supported
		System.out.println(s.hashCode());
		Singleton s2=Singleton.getObject();
		System.out.println(s2.hashCode());
		//same object will be return 
		
	}

}
