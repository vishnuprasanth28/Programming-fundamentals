package com.chainsys.day3;

public class Pattern3 {
	    public static void main(String[] args) {
	        printPattern(4); // Adjust the argument to change the size of the pattern
	    }

	    public static void printPattern(int rows) {
	    	 for(int i=4;i>=1;i--) {
	             for(int space=i;space<4;space++) {
	                 System.out.print(" ");
	             }
	             for(int j=1;j<=2*i-1;j++) {
	                 if(j%2==0) {
	                     System.out.print(0);
	                 }
	                 else {
	                     System.out.print(1);
	                 }
	             }
	             System.out.println();
	         }

	     }
	}


