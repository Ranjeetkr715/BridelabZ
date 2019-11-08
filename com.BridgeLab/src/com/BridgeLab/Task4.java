package com.BridgeLab;

public class Task4
{
	public static void main(String[] args)
    {
       
           int n = 8;
           int power = 1;

           System.out.println("Powers of 2 that are less than 2^"+n);
           for(int i=0;i<=n;i++)
           {
               System.out.println("2^"+i+" = " + power);
               power = power * 2;
           }
       }
}


