
//1.write a java program to print sum of odd numbers upto N?
package com.java;

import java.util.Scanner;

public class SumofNodd {
	public static void main(String args[]) {
		
	int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
System.out.println("Sum of Odd numbers from 1 to "+n);
for(int i=1;i<=n;i++) {
	if(i%2!=0) {
		sum+=i;
		
}
}
System.out.println(sum);
}
}