package org.test;

import java.util.Scanner;

public class MultiplicationTable {
	

	public static void main(String[] args) {
		int n, j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Table");
		n=s.nextInt();
		System.out.println("Table upto");
		j=s.nextInt();
		for(int i=1;i<=j;i++) {
			int a=n*i;
			System.out.println(i+"*"+n+"="+a);
		}
			
	}
}
