package com.FunctionalPrograms;

import java.util.Scanner;

public class TwoD_Array {
	public static void main(String[] args) {
		
	int i, j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of rows");
	i = sc.nextInt();
	System.out.println("Enter number of columns");
	j = sc.nextInt();
	String arr[][] = new String[i][j];
	System.out.println("Enter the elements");
	for (int k=0; k<i;k++) {
		for (int l=0; l<j; l++) {
			arr[k][l] = sc.next();
		}
	}
	System.out.println("Your Two-D array is");
	for (int k=0;k<i;k++) {
		for (int l=0; l<j;l++) {
			System.out.print(arr[k][l] + " ");
		}
		System.out.println();
	}
}
}
