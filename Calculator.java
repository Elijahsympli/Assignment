/*
  2.Write a java program to illustrate Calculator class with addition, subtraction,
 multiplication methods that can take any number of parameters to perform the operation,
  without using method/constructor overloading
 */

package com.java;

import java.util.Scanner;


public class Calculator {
	public int addition(int...add) {//using varargs
		int sum=0;
		for(int i:add) {//we use for each loop here
			sum=sum+i;
		}
		return sum;
	}


public int substraction(int...sub) {
	//using varargs
		int s=0;
		for(int i:sub) {//we use for each loop here
			s=i-s;
		}
		return s;
	}
public int multiplication(int...mult) {
	//using varargs
		int m=1;
		for(int i:mult) {//we use for each loop here
			m*=i;
		}
		return m;
	}
public static void main(String[] args) {
	Calculator cl=new Calculator();
	int resultAdd=cl.addition(10,20);
	int resultMult=cl.multiplication(2,3);
	int resultSub=cl.substraction(10,15);
	System.out.println("Adddition:"+resultAdd);
	System.out.println("Multiplication:"+resultMult);
	System.out.println("Substraction:"+resultSub);
	
	
}

}
