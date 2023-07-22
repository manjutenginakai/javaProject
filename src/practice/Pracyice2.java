package practice;

public class Pracyice2 {
  public static void main(String[] args) {
	 
   int f1=0;
   int f2=1;
   int f3=0;
   System.out.print(f1+" "+f2+" ");
   int n=10;
   for(int i=1;i<=n-2;i++){
	   
	   f3=f1+f2;
	   
	   System.out.print(f3+" ");
   
	   f1=f2;
	   f2=f3;
   }
  }
  }
   
  

