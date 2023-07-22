package Diamond;

public class fddfgfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=5;
  int space=0;
  int star=n;
  
  for(int i=1;i<=n;i++){
	  for (int j = 1; j <star; j++) {
		  System.out.print(" * ");
	  }
	  for (int k = 1; k <= space; k++) {
		  System.out.print("  ");
		
	}
	  System.out.println();
		if(i<=n/2+1){
			star--;
			space+=2;
	}else{
		star+=2;
		space--;
	}
  }
	}

}
