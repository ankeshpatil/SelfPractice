package com.javapractice.sigletondesign;

import java.io.Serializable;

public class Singleton implements Serializable{
	
	private static Singleton ex;

	private Singleton() {
		System.out.println("In sigleton constructor");
	}

	public static synchronized Singleton getObject() {
		if (ex == null) {
			ex = new Singleton();
		}
		return ex;
	}
	
	protected Object readResolve() {  
		  return getObject();
	  }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	  
}