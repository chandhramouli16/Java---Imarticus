package Datatype;

public class Max {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int max=0;
		
	    for (int num : a) {
	            max = Math.max(max, num);
	        }
	    
	    int sum = 0;
        for (int num : a) {
            sum += num;
        }
        
	    System.out.println(max+" "+sum);

	}

}
