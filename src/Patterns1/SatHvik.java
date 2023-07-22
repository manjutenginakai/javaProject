package Patterns1;



public class SatHvik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
	      for(int i=1;i<=5;i++){
	    	  for(int j=1;j<=5;j++){
	    		  if(j==n/2+1||(i==1&&j<=n/2+1)||i==n/2+1||(i==n&&j>=n/2+1)||(j==1&&i>=n/2+1)||j==n&&i<=n/2+1)
	    			  System.out.print("# ");
	    	  else
	    	  System.out.print("  ");
	    	  }  
	    	  System.out.println();
	    	  }

	     
	       System.out.println();
	       
	       
	      for(int i=1;i<=5;i++){
	    	  for(int j=1;j<=5;j++){
	    		  if(j==n/2+1||i==n/2+1||(j==1&&i<n/2+1)||j==n&&i<=n/2+1)
	    			  System.out.print("o ");
	    	  else
	    	  System.out.print("  ");
	    	  }  
	    	  System.out.println();
	    	  }
	      
	      System.out.println();
	       
	       
	      for(int i=1;i<=n;i++){
	    	  for(int j=1;j<=n;j++){
	    		  if(i+j==n/2+2||j-i==n/2||i+j==n+n/2+1||i-j==n/2)
	    			  System.out.print("* ");
	    	  else
	    	  System.out.print("  ");
	    	  }  
	    	  System.out.println();
	    	  }

	      
	      
	      System.out.println();
	       
	       
	      for(int i=1;i<=5;i++){
	    	  for(int j=1;j<=5;j++){
	    		  if(j==n/2+1||i==n/2+1||i+j==n+1&&i<=n/2+1||i==j&&i<=n/2+1)
	    			  System.out.print("$ ");
	    	  else
	    	  System.out.print("  ");
	    	  }  
	    	  System.out.println();
	        }
	      
	      
	      System.out.println();
	       
	       
	      for(int i=1;i<=5;i++){
	    	  for(int j=1;j<=5;j++){
	    		  if(j==n/2+1||i==n/2+1||i+j==n+1&&i>=n/2+1||i==j&&i>=n/2+1)
	    			  System.out.print("& ");
	    	  else
	    	  System.out.print("  ");
	    	  }  
	    	  System.out.println();
	    	  }
	      
	      System.out.println();
	       
	       
	      for(int i=1;i<=5;i++){
	    	  for(int j=1;j<=5;j++){
	    		  if(j==n/2+1||i==n/2+1||i+j==n+1&&i<=n/2+1||i==j&&i>=n/2+1)
	    			  System.out.print("# ");
	    	  else
	    	  System.out.print("  ");
	    	  }  
	    	  System.out.println();
	    	  }
	      
	      System.out.println();
	       
	       
	      for(int i=1;i<=5;i++){
	    	  for(int j=1;j<=5;j++){
	    		  if(j==n/2+1||i==n/2+1||i+j==n+1&&i>=n/2+1||i==j&&i<=n/2+1)
	    			  System.out.print("@ ");
	    	  else
	    	  System.out.print("  ");
	    	  }  
	    	  System.out.println();
	    	  }
	}
}
