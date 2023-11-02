package Arrays;

public class MaxElement {

	public static void main(String[] args) {

		int[] arr= {12,3,45,78,2};
		int n=arr.length;
		int max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max+" is the largest element in the array");
	}

}
