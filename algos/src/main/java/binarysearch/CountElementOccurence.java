package binarysearch;

import java.util.Scanner;

public class CountElementOccurence {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int []arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = input.nextInt();
		
		int target = input.nextInt();
		int lastIndexOfOccurence = binarySearch(arr,n,target,false);
		int firstIndexOfOccurence = binarySearch(arr,n,target,true);
		System.out.println(lastIndexOfOccurence - firstIndexOfOccurence + 1);
		
		input.close();
	}
	
	public static int binarySearch(int arr[],int n, int target, boolean searchLower) {
		
		int start = 0, end = n-1;int result = -1;
		while(start <= end) {
			
			int mid = (start + end)/2;
			
			if(arr[mid] == target)
				if(searchLower) {
					result = mid;
					end = mid - 1; 
				}else {
					result = mid;
					start = mid + 1; 
				}
			else if(arr[mid] < target)
				start = mid+1;
			else
				end = mid - 1;
		}
		
		return result;
	}

}
