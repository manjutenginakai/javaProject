package Patterns1;

public class patterns15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int m=n/2+1;
	      for(int i=1;i<=n;i++){
	    	  for(int j=1;j<=m;j++){
	    		  if(j==1||j==m)
	    			  System.out.print("* ");
	    	  else
	    	  System.out.print("  ");
	    	  }  
	    	  
	
	if(i<=n/2){
		m--;
	}
	else{
		m++;
	}
	System.out.println();
	}
	}
}
