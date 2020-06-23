package com.anusha.projects.lambdabasics;

public class TypeInferenceExample {

	public static void main(String[] args) {
		//compiler figures out the type based on the assignment here
		printLambda(s -> s.length());
	}
	
	
	public static void printLambda(StringLengthLambda l) {
		System.out.print(l.getLength("Hello Lambda"));
	}
	
	
	interface StringLengthLambda {
		int getLength(String s);
	}
	
	

}