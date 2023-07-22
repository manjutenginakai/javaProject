package patterns;

public class number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
	     int x;
		 for(int i=1;i<=n;i++){
			 x=1;
		    	for(int j=1;j<=i;j++){//n place put i
		    		if(j<=i)
		    		System.out.print(j+" ");
		    		else
		    		System.out.print(x+++" ");
		    		
		    	}
		    	System.out.println();

	}
	}

	}
