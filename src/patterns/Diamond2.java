package patterns;

import java.util.Scanner;

public class Diamond2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     int star=n;
     int space=0;
     int x=1;
      for(int i=1;i<=n;i++){
    	 x=1;
    	  for(int j=1;j<=space;j++){
    		  System.out.print("  ");
    		  }
    	  for(int k=1;k<=star;k++){
    		  if(k<star/2+1)
    		  System.out.print((char)(64+x++)+" ");
    		  else
    			  System.out.print((char)(64+x--)+" ");
    	  }
    	  System.out.println();
    	  if(i<n/2+1){
    		 
    	    space++;
    	    star-=2;
      }
      else{
    	 
    	  space--;
    	  star+=2;
      }
      }
	}
}




