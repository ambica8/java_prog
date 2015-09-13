package com.java.aug;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[]numbers = {32,55,67,89,234};
    
    int largest = Integer.MIN_VALUE;
    
    
    for(int i=0;i<numbers.length;i++){
    	if(numbers[i] > largest){
    		largest = numbers[i];
    		
    	}
    }
    System.out.println("largest no in array is:"+largest);
    
    
	}

}
