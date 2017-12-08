package com.journaldev.java8.defaultmethod;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {

	}

	@Override
	public void method1(String str) {

	}

	public void log(String str){
		System.out.println("MyClass logging :: " + str);
		Interface1.print(str);
	}
	
	public static void main(String[] args){
		new MyClass().log("Test String");
	}
}
