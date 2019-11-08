package com.BridgeLab;

import java.util.Scanner;

public class Task23 
{
  public static void main(String [] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the String : ");
	  String str=sc.next();
	 char[] ch= str.toCharArray();
	  int l= ch.length;
	  int i;
	  for(i=0;i<l;i++)
	  {
		  for(int j=0;j<l;j++)
		  {
			  if(ch[i]<ch[j])
			  {
			  char temp=ch[i];
			  ch[i]=ch[j];
			  ch[j]=temp;
			  }
		  }
	  }
	 for(i=0;i<l;i++)
		  System.out.println(ch[i]);
	
  }
}
