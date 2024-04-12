package com.chainsys.work1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * program for simple cab service 
 */

public class Cab {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String userName = sc.next();
		
		System.out.println("enter your distance in kilometer");
		double kiloMeter =sc.nextDouble();
		
		if(kiloMeter>0) {
		System.out.println("choose your cab type micro, mini, prime ");
		String cabType = sc.next();
		while (!Pattern.matches("^[A-Z][a-z]+", cabType)) {
		
		if (cabType.equalsIgnoreCase("Micro")) {
			System.out.println(" Calculated hire price for "+userName+": "+CabFare.micro(kiloMeter));
		}
		else if(cabType.equalsIgnoreCase("mini")) {
			System.out.println(" Calculated hire price for "+userName +": "+CabFare.mini(kiloMeter));
		}
		else if(cabType.equalsIgnoreCase("prime")) {
			System.out.println(" Calculated hire price for "+userName+": "+CabFare.prime(kiloMeter));
		}
		else {
			System.out.println("Please enter the cab type");
		}
		break;
		}
		
		
		
	}
		else {
			System.out.println("Please enter a valid data");
		}
	}
		public static double discountCalculation(double price) {
		
		if(price>=2000 && price<5000) {
			System.out.println("eligible for 2% discount");
			double discountPrice = price*0.05;
			double payAble = price - discountPrice;
			return payAble;
		}
		else if(price>=5000) {
			System.out.println("eligible for 5% discount");
			double discountPrice = price*0.05;
			double payAble = price - discountPrice;
			return payAble;
		}
		else {
			System.out.println("not eligible for discount");
			return price;
		}
	}

}
}
