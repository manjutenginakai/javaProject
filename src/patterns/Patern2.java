package patterns;

public class Patern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++){
			for (int j=1; j<=5; j++){
				if(j%2!=0){
					System.out.print(j);
				}else{
					System.out.print("$");
				}
			}
			System.out.println();
		}
	}

}
