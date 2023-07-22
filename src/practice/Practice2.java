package practice;

public class Practice2 {
   public static void main(String[] args) {
	 int n=5;
	 for (int i = 1; i <=n; i++) {
       for(int j=n;j>=1;j--){
    	   if(i<=j){
    		   System.out.print("*");
    	   }else{
    		   System.out.print(" ");
    	   }
       }
       for (int k = 1; k <=n; k++) {
           for(int l=n;l>=1;l--){
        	   if(k<=l){
        		   System.out.print("*");
        	   }else{
        		   System.out.print(" ");
        	   }
           }
    	   System.out.println();
       
	}
}
}}
