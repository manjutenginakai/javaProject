package patterns;

public class manju1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      String str="manju";
//      for(int i=0;i<str.length();i++){
//    	  for(int j=0;j<=i;j++){
//    		  System.out.print(str.charAt(j)+" ");
//    	  }
//    	  System.out.println();
//      }
//	}
//
//}
		String str="manju";
	     int x;
		 for(int i=0;i<str.length();i++){
			 x=1;
		    	for(int j=0;j<=i;j++){//n place put i
		    		if(j<=i)
		    		System.out.print(str.charAt(j)+" ");
		    		else
		    		System.out.print(x+++" ");
		    		
		    	}
		    	System.out.println();
		 }
	}
}