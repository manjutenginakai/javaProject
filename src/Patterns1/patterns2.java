package Patterns1;

public class patterns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
	    int p=n;
	    int q=n;

		
	      for(int i=1;i<=n;i++){
	    	  for(int j=1;j<=n*2;j++){
	            if(j==p||j==q||i==n/2+1){
	    		System.out.print("*");
	            }
	    	 else
	    	 {
	    	  System.out.print(" ");
	    	}
	      }
	      p--;
	      q++;
	      
	    	  System.out.println();
	      }
	}
}



		

	

	


