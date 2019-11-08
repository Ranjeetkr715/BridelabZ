package com.BridgeLab;

public class Task2 {

	public static void main(String[] args)
	{	  
		int heads=0;
		int tails=0;
	    int counter = 1;
//	    double randNum = 0.0;
	    int flips = 100;
	 while(counter <= flips)
	        {
	        if(Math.random() <.5)
	            {
	                heads++;    
	            }
	            else
	            {
	                tails++;
	            }
	            counter++;      
	        }
         System.out.println(heads);
	     System.out.println(tails);
	     System.out.println("Percent of heads =" +100.0*heads/flips);
         System.out.println("percentage of tails ="+100.0*tails/flips);
	}
}

	


