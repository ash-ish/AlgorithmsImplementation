package binarysearch;

import java.util.Scanner;

/*
 * https://www.quora.com/q/cfhflbdziebjjjft/P3-Square-Root-without-using-inbuilt-functions
 */

public class Squareroot {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(	squareroot(n));
	}

	private static int squareroot(int n) {
		
		int start = 2;
		int end = n;
		int root = 1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(mid < n/mid) {
				root = mid;
				start = mid + 1;
			}
			else if(mid > n/mid)
				end = mid - 1;
			else {
				return mid;
			}
		}
		
		
		return root;
	}
	

}
