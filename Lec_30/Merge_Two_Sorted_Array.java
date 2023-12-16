package Lec_30;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr1= {1,3,5,7,8,9,11};
int [] arr2= {2,3,4,6};
int[] ans=MergeArray(arr1, arr2);
for(int i=0; i< ans.length; i++) {
	System.out.print(ans[i]+" ");
}
	}
	public static int[] MergeArray(int[] arr1,int[] arr2) {
		int n=arr1.length;
		int m=arr2.length;
		int [] ans=new int [n+m];
		int i=0; //arr1
		int j=0; //arr2
		int k=0; //ans
		while(i<n && j<m) {
			if(arr1[i] <= arr2[j]) {
				ans[k]=arr1[i];
				i++;
				k++;
			}else {
				ans[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m) {
			ans[k]=arr2[j];
			k++;
			j++;
		}
		return ans;
	}

}
