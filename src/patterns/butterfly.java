package patterns;

import java.util.Scanner;

public class butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     int star=1;
     for(int i=1;i<=n;i++){
    	 for(int j=1;j<=star;j++){
    		 System.out.print((char)(i+64)+" ");
    		 
    	 }
    	 System.out.println();
    	 if(i<n/2+1)
    		 star++;
    	 else
    		 star--;
     }
	}

}
