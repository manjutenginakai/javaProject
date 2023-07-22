package Onedarray;



public class Singledimensionalarray {
	
	public static void main(String[] args){
      String str="aaabbc";
      String str1=" ";
      
       for(int i=str.length();i>=0;i--){
    	   char ch=str.charAt(i);
    	   
    		 if(i%2==0){
    			 System.out.print(ch);
    	   }else{
    		   System.out.print(ch-97);
    	   }
    	   
       }
	}
}
     
	


