package Chegus;

import java.io.IOException;
import java.util.Scanner;

public class pcshutdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the seconds");
  int sec=sc.nextInt();
  
  Runtime r=Runtime.getRuntime();
  System.out.println("pe will shutdowne"+sec+"seconds");
  try{
	  r.exec("shutdowne -s-t"+sec);
  }
  catch (IOException e) {
	// TODO: handle exception
	  e.printStackTrace();
}
  }
  
  
  
	}


