package week1.assignment2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,7,6,8};
		int sum=0;
		Arrays.sort(arr);

	    for (int i = 0; i < arr.length; i++) {
		sum=sum+arr[i];
			
			}
	//System.out.println(+sum);
		int sum1=0;
		for (int j = 1; j <=8; j++) {
		sum1=sum1+j;
				
			}
		//System.out.println(+sum1);
		System.out.println("Missing element is "+ (sum1-sum));
	}
	
	
}

