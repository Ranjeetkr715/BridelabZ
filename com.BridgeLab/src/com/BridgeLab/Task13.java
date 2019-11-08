package com.BridgeLab;

public class Task13 {

	public static void main(String[] args)
	{
		{
			String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
			char[] chars=str.toCharArray();
     		int max=100000000;
			int random=(int) (Math.random()*max);	
			StringBuffer sb=new StringBuffer();
			
			while (random>0)
			{
				sb.append(chars[random % chars.length]);
				random /= chars.length;
			}

			String couponCode=sb.toString();
			System.out.println("Coupon Code: "+couponCode);	
		}
	}

	}


