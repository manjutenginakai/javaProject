package Diamond;

public class halodiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int n=7;
		int star=1;
		int space=n/2;
		 
		for(int i=0;i<=n;i++){
			for(int j=0;j<space;j++){
			System.out.print("  ");
			}
		
			for(int k=0;k<star;k++){
				
					System.out.print(" *");
				
			}
			System.out.println();
				if(i<n/2){			
					space--;
					star+=2;
				}
					else{
					star-=2;
					space++;
//						break;
					
				}	
				
			}
		}
	}
	


