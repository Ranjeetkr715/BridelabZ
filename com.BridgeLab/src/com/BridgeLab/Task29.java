package com.BridgeLab;

public class Task29 
{
	public static void main(String[] args)
	{
		String s = ("Hello name, We have your fullname as full_name in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016");
		String s1 = s.replaceFirst("name","ranjeet").replaceAll("full_name", "ranjeet Kumar").replaceAll("xxxxxxxxxx", "860325593").replaceAll("01/01/2016", "05/11/2019");
		System.out.println(s1);
	}
}
