package com.javaprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int c=a+b;
		while(c<=100)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
		

	}

}
