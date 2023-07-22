package Collections;

public class palindrom {

	public static void main(String[] args) {
		String str="manjnam";
		String res=" ";
		int n=str.length();
		int x=str.length();
		while(n!=0){
			x--;
			res=res+str.charAt(x);
			n--;
		}
		System.out.println("string is-->"+str);
		System.out.println("reverse steing is-->"+res);
		if(str==res)
			System.out.println("it is palendrom");
		else
			System.out.println("it is not a paledrom");
	}

}
