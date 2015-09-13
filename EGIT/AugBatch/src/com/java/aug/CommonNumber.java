package com.java.aug;
import java.util.HashSet;
public class CommonNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] s1 = {"one","shreeya","two","three","four","five","three"};
    
    String[] s2 = {"three" ,"shreeya", "four","five","six","seven"};
    
    
    HashSet<String> set = new HashSet<String>();
    
    for(int i = 0 ; i<s1.length ; i++)
    { 
    	for(int j = 0 ; j<s2.length ; j++)
    	{
    		if(s1[i].equals(s2[j]))
    		{
    			set.add(s1[i]);
    		}
    	}
    }
	System.out.println(set);
	
	}

}
