package com.sangamone;

import java.util.Scanner;

public class Pincode {

	
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pincode :");
		int a=sc.nextInt();
		
		if(a==762104)
		{
			String name="Daringbadi, orissa";
			System.out.println("The location name :  "+name);
		}
		if(a==827013)
		{
			String name="Bokaro, Jharkhand";
			System.out.println("The location name :  "+name);
		}
		if(a==827001)
		{
			String name="Dhanbad, Jharkhand";
			System.out.println("The location name :  "+name);
		}
	}
}
