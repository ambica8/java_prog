package com.java.aug;

public class Arr {
	public int commonElementFromGivenTwoArrys(int[] givenArra1, int[] givenArra2){
		
		  int commonElement = 0;
		  for( int count1 = 0; count1 < givenArra1.length; count1++){
			  for(int count2 = 0; count2 < givenArra2.length; count2++){
				    if(givenArra1[count1] == givenArra2[count2]) {
				    	  commonElement = givenArra2[count2];
				    	  
				    }
			  }
		  }
	 return commonElement;

}
}