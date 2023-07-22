package Chegus;

//import java.util.Scanner;

public class Nextprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Scanner sc=new Scanner(System.in);
//      System.out.println("enter no");
//      int n=sc.nextInt();
//       
//      for(int j=2;j<=100;j++){
             int n=6;
    	   boolean flag=true;
    	   for(int i=2;i<n;i++){
    		   if(n%i==0){
    			   flag=false;
    		       break;
    	   }
    	   if(flag==true){
    		   System.out.println(" prime");
//    		break;
    	   } else{
    		   System.out.println("not");
    	   }
      }
      }

}
