package Patterns1;

public class patterns14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
	      for(int i=1;i<=5;i++){
	    	  for(int j=1;j<=5;j++){
	    		  if(i==1||(i==n&&j<=n/2+1)||j==n/2+1)
	    			  System.out.print("* ");
	    	  else
	    	  System.out.print("  ");
	    	  }  
	    	  System.out.println();
	    	  }
	}

}
