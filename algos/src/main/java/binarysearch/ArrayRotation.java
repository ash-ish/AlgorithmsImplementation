package binarysearch;

import java.util.Scanner;

public class ArrayRotation {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int []arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = input.nextInt();
		
		int numberOfRotation = binarySearch(arr,n);
		System.out.println(numberOfRotation);
		
		input.close();
	}
	
	public static int binarySearch(int arr[],int n) {
		
		int start = 0, end = n-1;
		while(start <= end) {
			if(arr[start] < arr[end])
				return start;
			else {
				int mid = (start + end)/2;
				if(arr[mid] < arr[(mid+1)%n] && arr[mid] <arr[(mid-1)%n])
					return mid;
				else if(arr[mid] > arr[end])
					start = mid + 1;
				else if(arr[mid] < arr[end])
					end = mid - 1;
			}
		}
		
		return -1;
	}

}
