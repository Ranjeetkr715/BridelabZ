//functional program
package com.BridgeLab;

public class Task8 
{
	
	static void findTriplets(int[] arr, int n) 
	{ 
		for (int i=0; i<n-2; i++) 
		{ 
			for (int j=i+1; j<n-1; j++) 
			{ 
				for (int k=j+1; k<n; k++) 
				{ 
					if (arr[i]+arr[j]+arr[k] == 0) 
					{ 
						System.out.print(arr[i]); 
						System.out.print(" "); 
						System.out.print(arr[j]); 
						System.out.print(" "); 
						System.out.print(arr[k]); 
						System.out.print("\n"); 
						
					} 
				} 
			} 
		} 
} 

	 
	public static void main(String[] args) 
	{ 
		int arr[] = {1,0, -1, 2, -3}; 
		int n =arr.length; 
		findTriplets(arr, n); 

	} 
	} 
	 


