package com.FunctionalPrograms;

import java.util.Scanner;

public class WindChill {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit : ");
        double t = sc.nextDouble();
        System.out.print("Enter a Wind Speed in Miles Per Hour : ");
        double v = sc.nextDouble();
        
        if(t>50 && v<120 && v>3)
        {
        	calculateWindChill(t,v);
        }
        	else
        {
        	System.out.println("Enter vaild inputs");
        }
        
	}
public static void calculateWindChill(double temperature,double speed)
{
	double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) * (Math.pow(speed, 0.16)));
    System.out.printf("Wind Chill is : %.4f", windChill);
}
}
