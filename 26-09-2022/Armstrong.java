package com.pack;

import java.util.Scanner;

public class Armstrong {
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter a number");
	int number=sc.nextInt();
	int onum=number,rem=0,sum=0;
	
	while(number!=0) 
		{
			rem=number%10;
			sum=sum+rem*rem*rem;
			number=number/10;
		}
		if(onum==sum)
		System.out.println(onum+" is an armstrong number");
		else
			System.out.println(onum+" is not an armstrong number");
	}

}
