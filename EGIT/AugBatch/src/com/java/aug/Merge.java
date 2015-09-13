package com.java.aug;

public class Merge{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int[]a = {2,3};
		int[]b = {4,7};
		int[]c = merge(a,b);
		for(int i=0;i<a.length;i++)
			System.out.println(c[i]+" ");
		
	}
   public static int[]merge(int[]a , int[]b){
	   int[]c= new int[a.length + b.length];
       int i;
       for(i=0;i<a.length;i++)
    	   c[i] = a[i];
       
       for(int j=0; j<b.length ; j++)
    	   c[i++]=b[j];
          return c;
   }
}
