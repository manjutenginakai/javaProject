package Patterns1;

public class patterns18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
	      for(int i=1;i<=5;i++){
	    	  for(int j=1;j<=5;j++){
	    		  if(j==1||j==n||i==j)
	    			  System.out.print("* ");
	    	  else
	    	  System.out.print("  ");
	    	  }  
	    	  System.out.println();
	    	  }
	}

}
