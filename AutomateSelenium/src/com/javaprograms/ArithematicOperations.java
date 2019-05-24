//Demo for arithmetic operators 
package com.javaprograms;

import java.util.Scanner;

public class ArithematicOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("sum of a and b is"+(a+b));
		System.out.println("sum of a and b is"+(b-a));
		System.out.println("sum of a and b is"+(a*b));
		System.out.println("sum of a and b is"+(a/b));
		System.out.println("sum of a and b is"+(a%b));
		

	}

}
