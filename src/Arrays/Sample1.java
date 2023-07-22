package Arrays;

public class Sample1 {
	static int count;
	static Sample1 s1;
	int atm=1234;
	private Sample1(){
	count++;
}
	static Sample1 get(){
		if(count<1){
			s1=new Sample1();
		}
		return s1;
		}
		
	public static void setA(int atm){
		s1.atm=atm;
	}
	
}
	
	
	class Mainmethod{
		public static void main(String[] args) {
			Sample1 s1= Sample1.get();
			System.out.println(s1);
			System.out.println(s1.atm);
			Sample1.setA(5432);
			System.out.println(s1.atm);
			Sample1 s2=Sample1.get();
			System.out.println(s2);
			
		}
	}
