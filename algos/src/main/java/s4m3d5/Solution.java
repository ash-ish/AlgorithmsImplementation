/*
 * s4h3f5
	90
 * 
 * 
 * */

package s4m3d5;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		int indexOfRequiredCharacter = input.nextInt();
		int length = word.length();
		int maxRepetitionLength = 0;
		int totalLength = 0,count = -1;//count is initialized with -1 for resetting count using i
		for(int i = 0; i < length; i++) {
			char c = word.charAt(i);
			if(c >= 49 &&  c <= 57) {
				count = i - count -1;
				int temp = Integer.parseInt(String.valueOf(c));
				maxRepetitionLength = totalLength + count;
				totalLength = (totalLength + count )*temp;
			}
		}
		
		int value = indexOfRequiredCharacter % maxRepetitionLength;
		System.out.println(totalLength);
		System.out.println(maxRepetitionLength);
		
		input.close();
	}
}
