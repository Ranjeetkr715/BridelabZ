package com.BridgeLab;

import java.util.ArrayList;

public class Task14 {

	public static void main(String[] args)
	{
		long start=System.currentTimeMillis();
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=0;i<=100000;i++)
		{
			l.add(i);
		}
		
		long Stop=System.currentTimeMillis();
		
		long elapsedtime=(Stop -start);
		System.out.println(elapsedtime);

	}

}
