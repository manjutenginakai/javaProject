package Sub;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="hellojava";
//      String s2="hi";
//      String s3=s1.substring(0,5);
//      String s4=s1.substring(5);
//      String s5=s2.substring(0);
//      System.out.println(s3+" "+s5+" "+s4);
     
      
      char ch[]=s1.toCharArray();
      int count=0;
     for(char c1:ch){
    	 count++;
     }

    	System.out.println(count);  
      }
	}


