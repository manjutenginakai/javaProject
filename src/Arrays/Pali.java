package Arrays;

public class Pali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="nayan";
      int j=str.length()-1;
      
      String str1="";
      while(j!=0){
      str1=str1+str.charAt(j);
      j--;
      
      System.out.println(str1);
	}
      if(str1==str){
    	  System.out.println("palindrome");
      }else{
    	  System.out.println("not");
      }
	}
	}

