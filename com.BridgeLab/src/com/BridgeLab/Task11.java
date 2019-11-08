package com.BridgeLab;

import java.util.Scanner;

public class Task11
{
  public static void main(String [] args)
  {
	  Scanner sc=new Scanner (System.in);
	  System.out.println("enter the number");
	  int t=sc.nextInt();
	  int v=sc.nextInt();
	  
	  double w=(35.74 + 0.6215 *t +(0.4275*t +35.75)*Math.pow(v,0.16));
	  
	  System.out.println(w);
  }
}
