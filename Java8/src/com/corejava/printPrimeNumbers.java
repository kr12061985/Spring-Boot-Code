package com.corejava;

public class printPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int tem=0;
		for(int i=1;i<20;i++) {
			for(int j=2;j<i-1;j++) {
				if(i%j==0) {
					tem=tem+1;
				}
			}
			if(tem==0) {
				System.out.println(i);
			}else {
				tem=0;
			}
		}
		
		int num=13;
		boolean isprime=true;
		for(int a=2;a<num;a++) {
			if(num%a==0) {
				isprime=false;
			}
		}
			if(isprime) {
			System.out.println("it is prime number");
			}else {
				System.out.println("not prime");
			}
		
	}

}
