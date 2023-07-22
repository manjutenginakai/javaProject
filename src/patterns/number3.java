package patterns;

public class number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=1;
      for(int i=1;i<=5;i++){
    	 if(i%2!=0)
    	 {
    	  for(int j=1;j<=5;j++){  		  
    		  
    		  System.out.print(n+"  ");
    	  
    		  n++;
    	  }
    	 }
    	 
    	 
    		  else
    		  {
    			  int temp=5+n-1;
    			  for(int j=1;j<=5;j++){
    				  
    			  
    			  System.out.print(temp+"  ");
    			   temp--;
    		  }
    		  
    		  n=n+5;
    	  } 
    	 
    	  System.out.println();
    	 
    	 } 
      }
	


}

	
