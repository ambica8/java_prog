package com.java.aug;

public class StringReplc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		String words ="hello eric erik";
		
		String from = "E";
		
		String to = "H";
		
		
		
		System.out.println(replace(words,from,to));
	}

	
	  public static String replace(String aInput, String aOldPattern, String aNewPattern)
	  
	  {
		  if( aOldPattern.equals("") ) {
			  
			  throw new IllegalArgumentException("old pattern must have content. ");
			 
		  }
		  
		  final StringBuffer result = new StringBuffer();
		  
		  int startIdx = 0;
		  
		  int idxOld = 0;
		  
		  while ((idxOld = aInput.indexOf(aOldPattern, startIdx)) >= 0) {
			  
			  result.append( aInput.substring(startIdx, idxOld) );
			  
			  result.append( aNewPattern );
			  
			  startIdx = idxOld + aOldPattern.length();
			  
		  }
		  result.append(aInput.substring(startIdx));
		  
		  return result.toString();
			  
		  }
		  
	  }

