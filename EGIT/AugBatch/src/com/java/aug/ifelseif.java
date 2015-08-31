package com.java.aug;

public class ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int age = 40 ;
    
    if(age <20){
    	System.out.println(" You r Too Young For the Job ");
    	
    }
    else if(age==30){
    	System.out.println(" You r Apt  For the Job ");
    	
    }
    else if(age==40){
    	System.out.println(" We can Do a Testing on u ");
	}
    //if not none of above conditin executed then else part code will be executed
    else{
    	System.out.println(" You r not Apt  For the Job ");
    }
    System.out.println(" The Program Ends here");
	}
}
