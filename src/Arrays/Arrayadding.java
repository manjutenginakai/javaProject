package Arrays;

import java.util.Scanner;

public class Arrayadding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter string");
       String str=sc.nextLine();
       int arr=str.length()+1;
       char element='b';
       int index=2;
       for (int i = 0; i < arr; i++) {
    	   if(i%2==0){
		 char ch=str.charAt(i);
		 
		System.out.print(ch);
	}
       
	}

	}
}
