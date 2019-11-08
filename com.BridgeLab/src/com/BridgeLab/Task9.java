// functional program
package com.BridgeLab;

import java.util.Scanner;

public class Task9
{
	public static void main(String [] args)
	{
	double Distance;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number: ");
	int x1=sc.nextInt();
	int x2=sc.nextInt();
	int y1=sc.nextInt();
	int y2=sc.nextInt();
	
	Distance =Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	System.out.println(+Distance);

}
}
