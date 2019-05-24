//write program to concatenate given 2 string values
package com.javaprograms;

import java.util.Scanner;

public class concatstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstname");
		String str1 = sc.nextLine();
		System.out.println("Enter Lastname");
		String str2 = sc.nextLine();
		System.out.println(str1+str2);

	}

}
