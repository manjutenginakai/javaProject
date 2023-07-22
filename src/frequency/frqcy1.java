package frequency;

public class frqcy1 {
 public static void main(String[] args) {
	String str="adsfadsa";
	char []arr=str.toCharArray();
	int[] ans=new int[arr.length];
	int count;
	for(int j=0;j<arr.length;j++){
		count=1;
		for(int i=j+1;i<arr.length;i++){
			if(arr[j]==arr[i]){
				ans[i]=-1;
				count++;
			}}
		if(ans[j]!=-1)
		{
			ans[j]=count;
		}}
	for(int j=0;j<ans.length;j++){
		if(ans[j]!=-1){
			System.out.println(arr[j]+" "+ans[j]);
			
				
			}
		}
	}
}

