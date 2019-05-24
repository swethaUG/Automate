//Write a find a student gradebased on given marks
package com.javaprograms;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Student marks");
		  int studentmarks = sc.nextInt();
		  if(studentmarks>=90)
		  {
			  System.out.println("Student grade is A");
		  }
		  else if(studentmarks>=80)
		  {
			  System.out.println("Student grade is B");
		  }
		  else if(studentmarks>=70)
		  {
			  System.out.println("Student grade is C");
		  }
		  else 
		  {
			  System.out.println("Student grade is D");
		  }
	}

}
