package Chegus;

import java.util.Scanner;

public class Santu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter string");
		   String str[]=sc.nextLine().toUpperCase().split(" ");
		   String ans="";
		   for(int i=0;i<str.length;i++){
			   if(i<str.length-1)
				    ans=ans+convertoin(str[i])+" ";
				    else
					   ans=ans+convertoin(str[i]);
			   }
	           System.out.println(ans);
		   }




	private static String convertoin(String string) {
		// TODO Auto-generated method stub
		String ans="";
		for(int i=0;i<string.length();i++){
		if(i==0 ||i==string.length()-1)       
				ans=ans+ (char)(string.charAt(i)+32);
		else
			ans=ans+string.charAt(i);
		}
		return ans;
	}
}
