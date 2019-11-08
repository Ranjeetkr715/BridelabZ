package com.BridgeLab;

import java.util.Scanner;

public class Task22
{
		public static void swap(char[] ch, int i, int j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}

		public static void permutations(char[] ch, int currentIndex)
		{
			if (currentIndex == ch.length - 1) {
				System.out.println(String.valueOf(ch));
			}

  		for (int i = currentIndex; i < ch.length; i++)
			{
				swap(ch, currentIndex, i);
				permutations(ch, currentIndex + 1);
				swap(ch, currentIndex, i);
			}
		}
     public static void main(String[] args)
		{
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the string: ");
			String s = sc.next();
			permutations(s.toCharArray(), 0);
		}
	}

