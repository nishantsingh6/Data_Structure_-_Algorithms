package Lec_11;

public class Maximum_SubArray {

	public static void main(String[] args) {
//Brute force
	int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
	System.out.print(subArray(arr));
		
	}
	public static int subArray(int[] arr) {
		int ans=Integer.MIN_VALUE;   //2^-31;
		for(int i=0; i<arr.length; i++) {
			int prev_sum=0;
			for(int j=i; j<arr.length; j++ ) {
				prev_sum=prev_sum+arr[j];
				ans=Math.max(ans, prev_sum);
			}
		}
		return ans;
	}

}
