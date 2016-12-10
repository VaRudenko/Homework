package com.hillel.homework3;

public class Homework3 {
	public static void main(String[] args) {
		
	int x=2222;
	
	int a=x%10;
	int b=(x/10)%10;
	int c=(x/100)%10;
	int d=(x/1000)%10;
	
	int sum = a+b+c+b;
	
	System.out.println("Sum of number " + x + " Equel " + sum);
	}
}