package com.anusha.projects.lambdabasics;

public class MyFirstLambdaGreeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		MyFirstLambdaGreeter greeter = new MyFirstLambdaGreeter();
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.print("Hello world!");
			}
		};
		//call using anonymous inner class 
		//refine it using lambdas
		greeter.greet(() -> System.out.print("Hello world!"));
		greeter.greet(innerClassGreeting);

	}
	@FunctionalInterface
	public interface Greeting {
		public void perform();

	}

}
