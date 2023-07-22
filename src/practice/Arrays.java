package practice;

public class Arrays {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
       String str="aaabbc";
      int []arr=new int[123];
      for(int i=0;i<str.length();i++){
    	  char ch=str.charAt(i);
    	  int j=(int)ch;
    	  arr[j]++;
      }
      for(int i=0;i<arr.length;i++){
    	  if(arr[i]!=0){
    		  System.out.print(arr[i]+""+(char)i);
    	  }
	}}}
	
	
     
	
