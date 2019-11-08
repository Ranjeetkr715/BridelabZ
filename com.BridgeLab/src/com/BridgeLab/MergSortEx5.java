package com.BridgeLab;

public class MergSortEx5 
{
	public static void main(String [] args)
	{
		String [] s= {"ranjeet","sanjeet","sachit","mukesh","anant","abhishek","moti","safaraj","praveen","arvind"};
		
		String[] sortedArray[]=mergeSort(s);
		for(int i=0 ;i<sortedArray.length;i++)
		{
			System.out.println(sortedArray[i]+" ");
		}
	}

	public static String[] mergeSort(String[] list)
	{
		String sorted[]=new String[list.length];
		if(list.length==1)
		{
			sorted=list;
		}
		else
		{
			int mid=list.length/2;
			String left[]=null;
			String right[]=null;
			if(list.length%2==0)
			{
				 left =new String[list.length/2];
				 right=new String[list.length/2];
		   }
			else
			{
				left=new String[list.length/2];
				right=new String[(list.length/2)+1];
			}
			
			int x=0;
			int y=0;
			for( ;x<mid;x++)
			{
				left[x]=list[x];
			}
			
			for( ;x>mid;x++)
			{
				right[y++]=list[x];
			}
			left=mergeSort(left);
			right=mergeSort(right);
			sorted=mergeSort(left,right);
		}
		return sorted;
	}

	public static String[] mergeSort(String[] left, String[] right)
	{
		String merge[]=new String[left.length +right.length];
		int lindex=0;
		int rindex=0;
		int midindex=0;
	    int comp=0;
	    
	    while(lindex<left.length ||rindex<right.length)
	    {
	    	if(lindex==left.length)
	    		merge[midindex++]=merge[rindex++];
	    	else if(rindex==right.length)
	    		merge[midindex++]=merge[lindex];
	    	else
	    	{
	    		comp =left[lindex].compareTo(right[rindex]);
	    		if(comp>0)
	    		{
	    			merge[midindex++]=right[rindex++];
	    		}
	    		else if(comp<0)
	    		{
	    			  merge[midindex++] = left[lindex++];
                } else { 
                    merge[midindex++] = left[lindex++];
	    		}
	    	}
	    	
	    }
		return merge;
	}

}
