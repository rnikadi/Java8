package com.journaldev.java8.funInterfLamExp;
public class FunctionalInterfaceLambdaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// An interface with exactly one abstract method becomes Functional Interface. We don’t need to use @FunctionalInterface annotation to mark an interface as Functional Interface. @FunctionalInterface annotation is a facility to avoid accidental addition of abstract methods in the functional interfaces.
		// java.lang.Runnable with single abstract method run() is a great example of functional interface.
		// One of the major benefits of functional interface is the possibility to use lambda expressions to instantiate them. We can instantiate an interface with anonymous class but the code looks bulky.
		Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println("My Runnable");
			}};
			
			r.run();
			
		// Since functional interfaces have only one method, lambda expressions can easily provide the method implementation. We just need to provide method arguments and business logic. For example, we can write above implementation using lambda expression as: 
		Runnable r2 = () -> {
				System.out.println("R2 My Runnable");
			};
			
			r2.run();
			
		// If you have single statement in method implementation, we don’t need curly braces also.	
		Runnable r3 = () -> System.out.println("R3 My Runnable");
		r3.run();
		
	}

}
