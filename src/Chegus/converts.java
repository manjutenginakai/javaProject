package Chegus;

import java.util.Scanner;

public class converts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		   System.out.println("enter string");
		   String str[]=sc.nextLine().toLowerCase().split(" ");
		   String ans="";
		   for(int i=0;i<str.length;i++){
			   if(i<str.length-1){
				   if(i%2!=0)
					   ans=ans+cnvertion(str[i])+" ";
				   else
					   ans=ans+str[i]+" ";
			   }else{
				   if(i%2!=0)
					 ans=ans+cnvertion(str[i]);
				    else
					   ans=ans+str[i];
			   }
		   }
			   System.out.println(ans);
		   }

	

	private static String cnvertion(String string) {
		// TODO Auto-generated method stub
		String ans="";
		for(int i=0;i<string.length();i++){
		if(i==0 ||i==string.length()-1)          //length()-1 is 1st and last letter big
				ans=ans+ (char)(string.charAt(i)+32);
	}
	
		return ans;
	
	}

}
