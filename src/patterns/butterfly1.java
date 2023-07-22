package patterns;

import java.util.Scanner;

public class butterfly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter number");
	     int n=sc.nextInt();
	     int star=1;
	     int space=n-2;
	    
	     for(int i=1;i<=n;i++){
	    	 for(int j=1;j<=star;j++){
	    		 System.out.print(j+" ");
	    	 }
	    	 for(int k=1;k<=space;k++){
	    	
	    	   System.out.print("  ");
	    	 
	    	  
	    	 }
	    	  for(int l=star;l>=1;l--){
	    		  
	    		  if(i<n/2+1)
	    		  System.out.print(l+" ");
	    	  
	    	 }
	    	 System.out.println();
	    	 if(i<n/2+1){
	    		 star++;
	    	     space-=2;
	    	 }else{
	    		 star--;
	    	     space+=2;
	    	 }
	     }
	}

	}


