package com.BridgeLab;

import java.util.Arrays;
import java.util.Scanner;

public class Task25 
{
 public static void main(String [] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the first String: ");
	 String s1=sc.next();
	 System.out.println("enter the second string: ");
	 String s2=sc.next();
	 
	 char ch1[]=s1.toCharArray();
	 char ch2[]=s2.toCharArray();
	 
	 if(toAnagram(ch1,ch2))
	 {
		 System.out.println("both are anagram String" );
	 }
	 else
	 {
		 System.out.println("both are not a anagram String" );
	 }
 }

   public static boolean toAnagram(char[] ch1, char[] ch2)
   {
	   int l1=ch1.length;
	   int l2=ch2.length;
	   
	   if(l1!=l2)
	   {
		   return false;
	   }
	   
	   Arrays.sort(ch1);
	   Arrays.sort(ch2);
	   
	   for(int i=0;i<l1;i++)
	   {
		   if(ch1[i]!=ch2[i])
		   {
			   return false;
		   }
		   
	   }
   return true;
}
}
