package com.epam.algos;

import java.util.HashMap;
import java.util.Scanner;

public class RabinKarp {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
    	System.out.println(isInputPresent(input.next(), input.next()));
    	input.close();
		
	}

	private static boolean isInputPresent(String paragraph, String word) {
		boolean result = false;
		
		long hashCode = getHastCode(word);
		int paragraphLength = paragraph.length();
		int wordLength = word.length();
		
		int i = 0;int j = 0;
		while (i < paragraphLength) {
			int number = 0;
			int tenPower = wordLength-1;
			for (; j < wordLength; j++) {
				
				number += alphabetNumber(word.charAt(j)) * Math.pow(10, tenPower);
				tenPower--;
			}
			
			if(number == hashCode) {
				result = true;
			}else {
				j++;
			}
			
			i++;
			System.out.println(number);
		}
		
		System.out.println("hashcodde " + hashCode );
		
		return result;
	}

	private static long getHastCode(String word) {
		int length = word.length();
		HashMap<Character, Integer> characterToNumber = new HashMap<Character, Integer>();
		for(int i = 97,j=1;i<=122;i++,j++) {
			char c = (char) i;
			characterToNumber.put(c, j);
		}
		
		int number = 0;
		for (int i = 0; i < length; i++) {
			number += characterToNumber.get(word.charAt(i)) * Math.pow(10, length-i-1);
		}
		
		return number;
	}
	
	
	private static int alphabetNumber(char alphabet) {
		HashMap<Character, Integer> characterToNumber = new HashMap<Character, Integer>();
		for(int i = 97,j=1;i<=122;i++,j++) {
			char c = (char) i;
			characterToNumber.put(c, j);
		}
		
		return characterToNumber.get(alphabet);
	}

}
