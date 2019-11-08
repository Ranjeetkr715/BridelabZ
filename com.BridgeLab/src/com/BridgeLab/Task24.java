package com.BridgeLab;

public class Task24
{
	public static void main(String [] args)
	{
   int arr []= { 30 ,40,10,5,7,49,11,35,100};
   int i;
     for( i=0;i<arr.length;i++)
     {
    	 for(int j=0;j<arr.length;j++)
    	 {
    		 if(arr[i]<arr[j])
    		 {
    			 int temp=arr[i];
    			 arr[i]=arr[j];
    			 arr[j]=temp;
    		 }
    	 }
     }
     System.out.println("number is in Sorted order: ");
     for(i=0;i<arr.length;i++)
     {
    	 System.out.println(arr[i]);
     }
   
}
}
