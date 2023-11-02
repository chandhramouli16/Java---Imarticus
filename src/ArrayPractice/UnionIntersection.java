package ArrayPractice;

public class UnionIntersection {

	public static void printArray(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void union(int[] a,int[] b) {
		int[] union1=new int[a.length+b.length];
		int n=union1.length;
		int flag=0;
		
		for(int i=0;i<a.length;i++) {
			if(i<a.length)
				union1[i]=a[i];
		}
		
		int index=a.length;
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<index;j++) {
				if(union1[j]==b[i]) {
					n--;
					flag=1;
					break;
				}
			}
			if(flag==0) {
				union1[index]=b[i];
				index++;
			}
			flag=0;
		}
		
		printArray(union1,n);
	}
	
	public static void intersection(int[] a,int[] b) {
		int n=0,i=0;
		int[] intersection1=new int[(a.length+b.length)/2];
		
		for(int j=0;j<a.length;j++) {
			for(int k=0;k<b.length;k++) {
				if(a[j]==b[k]) {
					intersection1[i]=a[j];
					i++;
					n++;
				}
			}
		}
		
		printArray(intersection1,n);
	}
	
	public static void main(String[] args) {

		int array[]= {1,2,3,4,5};
		int array1[]= {5,3,6,7,9};
		
		System.out.println("Union : ");
		union(array,array1);
		System.out.println("Intersection : ");
		intersection(array,array1);
		
	}

}
