package Arrays;

public class DiffBetMaxMin {

	public static void main(String[] args) {
	
		int[] arr= {1,2,3};
		int n=arr.length;
		int min=arr[0];
		int max=arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		
		for(int i=1;i<n;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		
		System.out.println("Difference from max and min element in the array is : "+(max-min));
	}

}
