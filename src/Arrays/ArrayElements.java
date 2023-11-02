package Arrays;

public class ArrayElements {

	public static void main(String[] args) {

		int arr[]= {1,-20,3,-4,2,-17,8,8,3};
		
		int inc=0, inc1=0, inc2=0, inc3=0;
		
		int[] even=new int[arr.length];
		int[] odd=new int[arr.length];
		int[] neg=new int[arr.length];
		int[] dup=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				neg[inc++]=arr[i];
			}
			if(arr[i]%2==0) {
				even[inc1++]=arr[i];
			}
			if(arr[i]%2!=0) {
				odd[inc2++]=arr[i];
			}
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					dup[inc3++]=arr[i];
				}
			}
		}
		
		System.out.println("Even numbers : ");
		for(int i=0;i<inc1;i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println();
		
		System.out.println("Odd numbers : ");
		for(int i=0;i<inc2;i++) {
			System.out.print(odd[i]+" ");
		}
		System.out.println();
		
		System.out.println("Negative numbers : ");
		for(int i=0;i<inc;i++) {
			System.out.print(neg[i]+" ");
		}
		System.out.println();
		
		System.out.println("Duplicate numbers : ");
		for(int i=0;i<inc3;i++) {
			System.out.print(dup[i]+" ");
		}
		
	}
}
