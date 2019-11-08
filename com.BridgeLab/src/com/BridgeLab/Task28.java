package com.BridgeLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task28 
{
	public static void main(String [] args)
	{
	List<Integer> al=new ArrayList<Integer>();
	al.add(50);
	al.add(30);
	al.add(70);
	al.add(10);
	al.add(2);
	System.out.println(al);
	Collections.sort(al);
    System.out.println("after sorting element is: "+al);
    System.out.println(al.contains(30));
}
}
