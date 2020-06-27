package com.service;

public class Problem2 {

	public static boolean palindromeDescendant(int num) {
		boolean isSym =false;
		System.out.print(num+" -> ");
		while(num > 9) {
			if(isSymmtrical(num)) {
				isSym=true;
				break;
			}
			num =getSumOfDigits(num);
		}
		
		return isSym;
		
	}
	public static boolean isSymmtrical(int num) {
		int reversenum=0,n=num;
		if(n<0) n= n*-1;
		while(n!=0) {
			reversenum=reversenum*10;
			reversenum=reversenum+n%10;
			n=n/10;
		}
		//System.out.print(num+" -> ");
		return (reversenum == num);
		
	}
	public static int getSumOfDigits(int n) {
		String isString =Integer.toString(n);
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<isString.length()-1;i+=2) {
			int i1=Integer.parseInt(Character.toString(isString.charAt(i)));
			int i2=Integer.parseInt(Character.toString(isString.charAt(i+1)));
			int num =i1+i2;
			sb1.append(Integer.toString(num));
			
		}
		System.out.print(sb1.toString()+" -> ");
		return Integer.parseInt(sb1.toString());
	}
	
	public static void main(String[] args) {
		//11211230
		boolean palindromeDescendant = palindromeDescendant(11211230);
		System.out.println(palindromeDescendant);
	}
}
