package com.java.aug;

public class Smallest {
	
	
	public static int findSmallest(int[] arr)
	{
		int min = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min > arr[i])
			{ min = arr[i];
		}
	}
  return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {22,14,26,9,89,55};
      int minimum = findSmallest(arr);
      System.out.println("the smallest no in arr is  "+ minimum);
      
	}

}
