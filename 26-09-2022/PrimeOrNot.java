package com.pack;

import java.util.Scanner;

public class PrimeOrNot {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num1=sc.nextInt();
	int k=0;
	for(int i=1;i<=num1;i++) {
		if(num1%i==0) {
			k+=1;
		}
	
	}
	if(k==2) {
	System.out.println(num1+" is  a prime number");
	}
	else
	{
		System.out.println(num1+" is not a  prime number");

	}
}
}
