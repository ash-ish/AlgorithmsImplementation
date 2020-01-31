package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
	
	Given 2 integers A and B and an array of integars C of size N.
	
	Element C[i] represents length of ith board.
	
	You have to paint all N boards [C0, C1, C2, C3 … CN-1]. There are A painters available and each of them takes B units of time to paint 1 unit of board.
	
	Calculate and return minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of board.
	
	        2 painters cannot share a board to paint. That is to say, a board
	        cannot be painted partially by one painter, and partially by another.
	        A painter will only paint contiguous boards. Which means a
	        configuration where painter 1 paints board 1 and 3 but not 2 is
	        invalid.
	
	Return the ans % 10000003
	
	
	
	Input Format
	
	The first argument given is the integer A.
	The second argument given is the integer B.
	The third argument given is the integer array C.
	
	Output Format
	
	Return minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of board % 10000003.
	
	Constraints
	
	1 <=A <= 1000
	1 <= B <= 10^6
	1 <= C.size() <= 10^5
	1 <= C[i] <= 10^6
	
	For Example
	
	Input 1:
	    A = 2
	    B = 5
	    C = [1, 10]
	Output 1:
	    50
	Explanation 1:
	    Possibility 1:- same painter paints both blocks, time taken = 55units
	    Possibility 2:- Painter 1 paints block 1, painter 2 paints block 2, time take = max(5, 50) = 50
	    There are no other distinct ways to paint boards.
	    ans = 50%10000003
	
	Input 2:
	    A = 10
	    B = 1
	    C = [1, 8, 11, 3]
	Output 2:
	    11


 */

public class Painters {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int painters = input.nextInt(); 
		int B = input.nextInt();
		int n = input.nextInt();
		int []arr = new int[n];
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
			sum += arr[i];
		}
		
		int start = maxBoardSize(arr,n);
		int end = sum;
		
		
		System.out.println(B * getMinimumTime(start, end, arr, n, painters));
		
		
//		System.out.println(minimumTime(B,A,arr,n));
		input.close();
	}
	
	/*
	 * 3
1
4
1 8 7 3
	 */

	private static int getMinimumTime(int start, int end, int[] arr, int n, int painters) {
		
		
		int ans = 0;
		
		while(start <= end) {
			int tempSum = 0;
			int mid = (start + end)/2;
			int paintersCount = 1;
			for(int i=0;i<n;i++) {
				tempSum += arr[i];
				if(tempSum > mid) {
					paintersCount++;
					tempSum = 0;
					i--;
				}
			}
			System.out.println(paintersCount);
			if(paintersCount <=  painters) {
				ans = mid;
				end = mid - 1;
			}
			else {
				start = mid+1;
			}
		}
		return ans;
	}

	private static int maxBoardSize(int[] arr, int length) {
		Arrays.sort(arr);
		return arr[length-1];
	}

//	private static int minimumTime(int a, int b, int[] arr, int n) {
//		
//		Arrays.sort(arr);
//		if(n <= a)
//			return arr[n-1]*b;
//		
//		
//		int whileRun = 0;
//		int ans = 0,sahiAns = 10000000;
//		int v1 = 0;
//		while (whileRun < n) {
//			
//			int tempSum = 0;
//			int tempsum2 = 0;
//			for(int i=0;i<v1;i++)
//				tempSum += arr[i];
//			System.out.print(tempSum + " ");
//			
//			int aggSum = 0;
//			int control = 1;
//			for(int j=v1;j<n &&control<a;j++) {
//				aggSum += arr[j];
//				control++;
//			}
//			System.out.print(aggSum + " ");
//			
//			for (int i = v1+a; i < n; i++)
//				tempsum2 += arr[i];
//			System.out.print(tempsum2 + " ");
//			
//			ans = Math.max(tempSum, Math.max(aggSum, tempsum2));
//			if(sahiAns > ans)
//				sahiAns = ans;
//			
//			v1++;
//			whileRun++;
//			System.out.println();
//		}
//		
//		return sahiAns;
//	}
	
	

}































