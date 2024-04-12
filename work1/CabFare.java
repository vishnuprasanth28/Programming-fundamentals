package com.chainsys.work1;

public class CabFare {
	public static double micro(double kiloMeter) {
		double price = kiloMeter*10;
		double amountSaved =Cab.discountCalculation(price);
		return amountSaved;
		
	}
	public static double mini(double kiloMeter) {
		double price = kiloMeter*15;
		double amountSaved =Cab.discountCalculation(price);
		return amountSaved;
		
	}
	public static double prime(double kiloMeter) {
		double price = kiloMeter*20;
		double amountSaved =Cab.discountCalculation(price);
		return amountSaved;
		
	}


}
