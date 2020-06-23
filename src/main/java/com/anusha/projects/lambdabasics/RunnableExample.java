package com.anusha.projects.lambdabasics;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
			}
			
		});
		
		//Run it using Runnable
		myThread.run();
		//Define Lambda as argument
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
		myLambdaThread.run();
		

	}

}