package com.javaprograms;

public class StringMethodsDemo {

	public static void main(String[] args) {
		//Length() method
		String str = "  sWetha";
		String str1 = " SWETHA";
		System.out.println(str.length());
		//charAt() - To read data from the main string at a given index number
		System.out.println(str.charAt(2));
		//indexOf() - To find character from the main string at a given index number
		System.out.println(str.indexOf("e"));
		//toUppercase() - for converting string to uppercase
		System.out.println(str.toUpperCase());
		//toLowerCase() - for converting string to lowercase
		System.out.println(str.toLowerCase());
		//equals - used to compare strings(case sensitive)
		System.out.println(str.equals(str1));
		//equalsIgnoringCase() used to compare strings(not case sensitive)
		System.out.println(str.equalsIgnoreCase(str1));
		//startsWith() - to compare prefixed value of string(case sensitive)
		System.out.println(str.startsWith("S"));
		//endsWith() - To compare suffix value of a string(case sensitive)
		System.out.println(str.endsWith("A"));
		//contains() - to check substring available in main string or not
		System.out.println(str.contains(str1));
		//isEmpty() - for checking value in a variable is empty or not
		System.out.println(str.isEmpty());
		//concat() - used to concat string
		System.out.println(str.concat(str1));
		//trim() - removes leading and trailing spaces from a given string
		System.out.println(str.trim());
        //replace() - for replacing substring in a main string
		System.out.println(str.replace("e", "E"));
		//subString() - to read substring from main string
		System.out.println(str.substring(2,4));
	}

}
