package patterns;

public class number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=5;
    int x;
    for(int i=1;i<=n;i++){
    	x=n;
    	for(int j=1;j<=n;j++){
    		if(i%2!=0)
    		System.out.print(j+" ");
    		else
    		System.out.print(x-- +" ");
    		
    	}
    	System.out.println();
    }
	}

}
