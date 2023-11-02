package Arrays;

public class MinElement {

	public static void main(String[] args) {

		int[] arr= {12,3,45,78,2};
		int n=arr.length;
		int min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min+" is the smallest element in the array");
	}

}
