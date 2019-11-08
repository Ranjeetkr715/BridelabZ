package com.BridgeLab;

import java.util.Scanner;

public class Task17 
{
  public static float toCelsius(float C)
  {
	  float farenhite=(C*(9/5)+32);
	  return farenhite;
  }
  
  public static float toFarenhite(float F)
  {
	  float Celsius=((F-32)*(9/5));
	  return Celsius;
  }
  
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Celsius: ");
		float C=sc.nextFloat();
         float Celsius =toCelsius(C);
         System.out.println(Celsius);
         System.out.println("enter the Farenhite: ");
         float F=sc.nextFloat();
         float Farenhite =toFarenhite(F);
         System.out.println(Farenhite);
	}

}
