package com.epam.algos;
/*
 * Rabin-Karp Algorithm
 * 
 * input:
 * ccaccbdadba
 * dba
 * 
 * output:
 * true
 */

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
		int i = 0, j = 0;
		boolean firstIterationOfParagraph = true;
		int number = 0;

		while (i < paragraphLength) {
			int count = 0;
			int presentValue = 0;
			int tenPower = wordLength - 1;
			j = i;
			
			if (firstIterationOfParagraph) {
				while (count < wordLength) {
					number += alphabetNumber(paragraph.charAt(j)) * Math.pow(10, tenPower);
					tenPower--;
					j++;
					i++;
					count++;
				}
				i -= 1;
				firstIterationOfParagraph = false;
			} else {
				int previousIntitialValue = (int) (alphabetNumber(paragraph.charAt(i - wordLength))
						* Math.pow(10, wordLength - 1));
				presentValue = alphabetNumber(paragraph.charAt(i));
				number = ((number - previousIntitialValue) * 10) + presentValue;
			}
			
			if (number == hashCode) {
				result = true;
				break;
			}

			i++;
		}
		return result;
	}

	private static long getHastCode(String word) {
		int length = word.length();
		HashMap<Character, Integer> characterToNumber = new HashMap<Character, Integer>();
		for (int i = 97, j = 1; i <= 122; i++, j++) {
			char c = (char) i;
			characterToNumber.put(c, j);
		}

		int number = 0;
		for (int i = 0; i < length; i++) {
			number += characterToNumber.get(word.charAt(i)) * Math.pow(10, length - i - 1);
		}

		return number;
	}
	

	private static int alphabetNumber(char alphabet) {
		HashMap<Character, Integer> characterToNumber = new HashMap<Character, Integer>();
		for (int i = 97, j = 1; i <= 122; i++, j++) {
			char c = (char) i;
			characterToNumber.put(c, j);
		}

		return characterToNumber.get(alphabet);
	}

}
