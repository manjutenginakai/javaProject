package Chegus;

import java.util.Scanner;

public class happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println(" enetr number");
      int no=sc.nextInt();
      int sum=0;
      while(no>9){
    	  int rem=no%10;
    	  sum=sum+rem*rem;
    	  no=no/10;
      }
	
      if(no==1||no==7){
    	  System.out.println("happy no");
      }
    	  else{
    		  
    		  System.out.println("not happy no");
      }
      
	}

}
