//Write program to find smaller value in a given three numbers
package com.javaprograms;

import java.util.Scanner;

public class SmallerValue {

	public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter i value");
		  int i = sc.nextInt();
		  System.out.println("Enter j value");
		  int j = sc.nextInt();
		  System.out.println("Enter k value");
		  int k = sc.nextInt();
		  
          if(i<j && i<k)
          {
        	  System.out.println("Smaller value is"+i);
          }
          else if(j<k)
          {
        	  System.out.println("Smaller value is"+j);
          }
          else
          {
        	  System.out.println("Smaller value is"+k);
          }

				

	}

}
