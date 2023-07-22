package Exception;
 import java.lang.Exception;
public class Shaadidotcom {
	static void submit() throws Exception
	{
	int age=15;
	if(age>=21){
		System.out.println("happy life");
	}else{
		throw new Exception("invalide age");
	}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     try{
    	 submit();
    	 
     }
     catch(MarraigeException e){
    	 System.out.println(e.get());
     }
	}
	class MarraigeException extends Exception{
		String msg;
		public MarraigeException(String msg)
		{
			this.msg=msg;
		}
		public String get(){
			return msg;
		}
	}

}
