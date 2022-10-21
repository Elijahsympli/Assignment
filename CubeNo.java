package com.java;
//Q2.write a program in java to diaplay the cube of the number upto given an integer.
import java.util.Scanner;

public class CubeNo {
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an integer number:");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		int cube=1;
		for (int j=0;j<3;j++) {
			
			cube*=i;
		}
		System.out.println("Cube of "+i+" is "+cube);
	}
}
}
