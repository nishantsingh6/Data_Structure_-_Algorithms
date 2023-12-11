package Lec_19;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {10,5,2,6};
int k=100;
System.out.println(numSubarrayProductLessThanK(arr, k));
	}
	 public static int numSubarrayProductLessThanK(int[] nums, int k) {
	        int si=0;
	        int ei=0;
	        int ans=0;
	        int p=1;
	        while(ei<nums.length){
	            //Window grow
	            p=p*nums[ei];
	        //Window Shrink
	        while(p>=k && si<=ei){
	            p=p/nums[si];
	            si++;
	        }
	        //ans update
	        ans=ans+ei-si+1;
	        ei++;
	        }
	        return ans;
	    }
}
