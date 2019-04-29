package com.test.coreJava;

/* This class is to reverse the words from back to front from a Char array String to make the correct arrangement.
 *  e.g. "test a is this" ==> just think this is a char array separating words by a space. now we have to reverse the string like
 *  "this is a test"
 * 
 * we first reverse the whole String then reverse every word of the string to make is desired result
 * */

public class ReserveCharStringbyWords {

	public static void main(String[] args) {
		
		
		// you can use a String and convert that to a Char[]. Like below.
		
		String sampleStr="test a is this";
		char sampleInput[] = sampleStr.toCharArray();
		
		//char[] sampleInput= new char[] {'t','e','s','t',' ','a',' ','i','s',' ','t','h','i','s',' ','h','i'};
		
		System.out.println("Original String # ");
		for (char c : sampleInput) {
			System.out.print(c);
		}
		
		reverseWord(sampleInput, 0, sampleInput.length-1);
		
		System.out.println("\nReverted String # ");
		for (char c : sampleInput) {
			System.out.print(c);
		}
		
		
		int startindx=0;
		
		for(int j=0; j<=sampleInput.length; j++) {
			
			
			if(j == sampleInput.length || sampleInput[j]==' ') {			
				reverseWord(sampleInput,startindx,j-1);
				startindx=j+1;
			}			
		}
		
		System.out.println("\nFinal String # ");
		for(int i=0;i<sampleInput.length;i++)
			System.out.print(sampleInput[i]);

	}
	
	public static char[] reverseWord(char[] inputMsg, int startIndex, int endIndex) {
		
		char temp;
		int startInd=startIndex;
		int endInd=endIndex;
		
		while(startInd<endInd){
			temp=inputMsg[endInd];
			inputMsg[endInd]=inputMsg[startInd];
			inputMsg[startInd]=temp;
			
			startInd++;
			endInd--;
		}
		
		
		return inputMsg;
		
	}

}
