package com.epam.algos;
import java.util.Scanner;

import org.apache.log4j.Logger;
public class KMP 
{
	static Logger logger = Logger.getLogger(KMP.class);
	
    public static void main( String[] args )
    {
    	Scanner input = new Scanner(System.in);
    	System.out.println(findString(input.next(), input.next()));
    	input.close();
    }

    
	private static boolean findString(String fileContents, String stringToBESearched) {
		boolean result = false;
		int []lps = getLPS(stringToBESearched);
		int fileContentslengths =  fileContents.length();
		int stringToBESearchedLength = stringToBESearched.length();
		int j = -1;
		for (int i = 0; i < fileContentslengths && j < stringToBESearchedLength; i++) {
			if(j == stringToBESearchedLength-1) {
				result = true;
				break;
			}
			if(fileContents.charAt(i) == stringToBESearched.charAt(j+1)) {
				j++;
			}else {
				j = lps[j+1];
			}
		}
		return result;
	}

	
	private static int[] getLPS(String stringToBESearched) {
		int length = stringToBESearched.length();
		int []lps = new int[length];
		int i = 0;
		boolean matched = false;
		int matchedCount = 0;
		for (int j = 1; j<lps.length; j++) {
			if(stringToBESearched.charAt(j) == stringToBESearched.charAt(i)) {
				matchedCount++;
				matched = true;
				if(matched)
					lps[j] = matchedCount;
				else
					lps[j] = 1;
				i++;
			}else {
				matched = false;
				matchedCount = 0;
				i = 0;
			}
		}
		return lps;
	}
}
