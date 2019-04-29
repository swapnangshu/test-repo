package com.test.coreJava;

import org.junit.Test;

import static org.junit.Assert.*;

/* This Program is to Reverse a CharArray
 * e.g: Input ABCDE :result will be EDCBA
 * InterviewCreek example 2
 * */


public class ReverseCharArray {

	public static void main(String[] args) {
		
		// call the test cases
		//longerStringTest();
		
		final char[] actual = "ABCDE".toCharArray();
		
		for (char c : actual) {
			System.out.println(c);
		}
        reverse(actual);
        System.out.println("After Reversed");
        for (char c : actual) {
			System.out.println(c);
		}
		
		

	}
	
	
	public static void reverse(char[] arrayOfChars) {
        // reverse input array of characters in place
		
			
		int lastIndex=(arrayOfChars.length -1);
		int firstIndex=0;
		
		while (firstIndex <= lastIndex) {
			char temp= arrayOfChars[lastIndex];
			arrayOfChars[lastIndex]=arrayOfChars[firstIndex];
			arrayOfChars[firstIndex]=temp;
			
			firstIndex++;
			lastIndex--;
		}        

    }
	
	
	
	
	
	@Test
    public static void emptyStringTest() {
        final char[] actual = "".toCharArray();
        reverse(actual);
        final char[] expected = "".toCharArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    public static void singleCharacterStringTest() {
        final char[] actual = "A".toCharArray();
        reverse(actual);
        final char[] expected = "A".toCharArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    public static void longerStringTest() {
        final char[] actual = "ABCDE".toCharArray();
        reverse(actual);
        final char[] expected = "EDCBA".toCharArray();
        assertArrayEquals(expected, actual);
    }

}
