package Arrays;

import java.util.Scanner;

public class frequency1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		
		int arr[]=new int[122];
		for (int i = 0; i < str.length(); i++) {
           char ch=str.charAt(i);
           
           arr[ch]++;
		}
           for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0){
			System.out.println((char)i+" "+arr[i]);
				
		}
		}
	}
 
 

}

