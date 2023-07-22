package Arrays;

import java.util.Scanner;

public class spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the row");
    int row=sc.nextInt();
    System.out.println("Enter the cols");
    int cols=sc.nextInt();
    
	
	System.out.println("enter"+row*cols+"elements");
	int arr[][]=new int[row][cols];
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			arr[i][j]=sc.nextInt();
		}
	}
		System.out.println("intput matrix...");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("anticlock wise by 90^..");
//		for(int i=0;i<arr.length;i++){
//			for(int j=arr[i].length-1;j>=0;j--){
		for(int i=arr.length-1;i>=0;i--){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			
			}
			System.out.println();
		}
		System.out.println("row wise reverse..");
//		for(int k=0;k<arr.length;k++){
		 for(int l=arr.length-1;l>=0;l--){
			 for(int k=0; k<arr[l].length;k++){
				System.out.print(arr[l][k]+" ");
		 }
		 
		
		 System.out.println();
			
		 }
	}
		 }
		
		
	


	


