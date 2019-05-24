//Write a program to find number of times occurance of "A" in "demogaasoft"
package com.javaprograms;

public class AlphabetOccurance {

	public static void main(String[] args) {
		String str = "demogaasoft";
		int count=0;
		for (int i=0;i<=str.length();i++)
		{
			if(str.charAt(i)=='a')
			{
				count++;
				System.out.println("index of a is"+i);
			}
			
		}
		System.out.println("occurance of a is"+count);
	}

}
