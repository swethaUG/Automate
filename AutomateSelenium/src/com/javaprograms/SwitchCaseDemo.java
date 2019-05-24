package com.javaprograms;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any one character from RGB");
		String mycolor = sc.nextLine();
		switch(mycolor.toUpperCase())
		{
		case"R":
			System.out.println("your choice color is : RED");
			break;
		case"G":
			System.out.println("your choice color is : GREEN");
			break;
		case"B":
			System.out.println("your choice color is : BLUE");
			break;	
		default:
			System.out.println("Invalid entity");
			
		}
		

	}

}
