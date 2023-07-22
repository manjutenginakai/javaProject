package patterns;

import java.util.Arrays;

public class charecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,6,7};
		int arr1[]={2,3,6,5,1};
	    int ans []=new int [arr.length+arr1.length];
	    int ans1[]=new int[ans.length];
	    int x=0;
	    
		for (int i = 0; i < arr.length; i++) {
		ans[x]=arr[i];
		x++;
		}
		for (int j = 0; j < arr1.length; j++) {
			ans[x]=arr1[j];
			x++;
		}
		System.out.println(Arrays.toString(ans));
			
	
         for(int k=0;k<ans1.length;k++){
        	 int count=1;
        	 for (int l = 0; l < ans1.length; l++) {
        		 if(ans1[k]==ans1[l]){
        			 ans1[l]=-1;
        			 count++;
        			 
        		 }
				
			}
        	 if(ans1[k]!=-1){
        		 ans1[k]=count;
        	 }
        	 for(int k1=0;k1<ans1.length;k1++){
        		 if(ans1[k1]!=-1){
        			 
					System.out.println(ans1[k]);
        		 }
        	 }
        	 
         }
	}
}
		





	


