package com.BridgeLab;

import java.util.Scanner;

public class Task12 
{
public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int stack=sc.nextInt();
		int goal=sc.nextInt();
     	int trail=sc.nextInt();
		
		int bets=0;
		int won=0;
		for(int i=0;i<trail;i++)
		{
			int cash=stack;
			while(cash>0 && cash<goal)
			{
				bets++;
				if(Math.random()<0.5)
				{
					cash++;
				}
				else
				{
					cash--;
				}
				if(cash==goal)
				{
					won++;
				}
			}
		}	
		     System.out.println(won +" wons of"+trail);
		     System.out.println("Percent of games won =" +100.0*won/trail);
		     System.out.println("avg bets=" +1.0*bets/trail);
          }
      }

