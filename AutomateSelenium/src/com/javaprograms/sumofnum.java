//sum of any two numbers during runtime using scanner class
package com.javaprograms;

import java.util.Scanner;

import net.bytebuddy.description.modifier.SynchronizationState;

public class sumofnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Sum of two numbers is"+num1+num2);
		System.out.println("Sum of two numbers is"+(num1+num2));
		

	}

}
