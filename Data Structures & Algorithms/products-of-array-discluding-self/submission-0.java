class Solution {
  	public static int[] productExceptSelf(int[] arr) {	
		int temp=1;
		int result[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) { //1,2,3,4
			result[i]=temp;
			temp=temp* arr[i];  //1	,1, 		
		}
		temp=1;
		for(int i=arr.length-1;i>=0;i--) {
			result[i]=result[i]*temp;
			temp= 	temp*arr[i];
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+",");
		}
		return result;
	}

}

