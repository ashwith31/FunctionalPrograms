package com.FunctionalPrograms;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);        // taking input co-ordinates from the user      
    System.out.print("Enter x co-ordinate Value: ");
    int x = scanner.nextInt();
    System.out.print("Enter y co-ordinate Value: ");
    int y = scanner.nextInt();
    
    // formula
    float distance = (float) Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    System.out.printf("Distance from origin is: %.4f ", distance);   
}
}

