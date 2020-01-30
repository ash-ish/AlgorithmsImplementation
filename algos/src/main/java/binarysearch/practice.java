package binarysearch;

import java.util.Scanner;

public class practice {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int []arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = input.nextInt();
		
		int target = input.nextInt();
		System.out.println(binarySearch(arr,n,target));
		
		input.close();
	}
	
	public static int binarySearch(int arr[],int n, int target) {
		
		int start = 0, end = n-1;
		while(start <= end) {
			
			int mid = (start + end)/2;
			
			if(arr[mid] == target)
				return 1;
			else if(arr[mid] < target)
				start = mid+1;
			else
				end = mid - 1;
		}
		
		return -1;
	}

}
