package com.test.coreJava;

/* This program is to merge two sorted int[] in a sorted order 
 * i.e arry1[]={2,5,8,11,12}  and arry2[]={1,3,6,7,14}
 * result # {1,2,3,5,6,7,8,11,12,14}
 * 
 * */

public class mergeSortedArrays {

	public static void main(String[] args) {
		
		int[] array1 =new int[]{2,5,8,11,12};
		//int[] array1 =new int[]{};
		int[] array2 =new int[]{1,3};
		//int[] array2 =new int[]{};
		
		int[] mergedArray= mergeArray(array1,array2);
		
		for (int i : mergedArray) {
			System.out.print(" "+i);
		}
		

	}
	
	public static int[] mergeArray(int[] array1, int[] array2) {
		
		int[] mergedArray =new int[array1.length + array2.length];
		
		int currentIndex=0;
		int arr1Index=0;
		int arr2Index=0;
		
		while(currentIndex<mergedArray.length) {
			
			/*if(arr1Index >= array1.length && arr2Index < array2.length) {
				mergedArray[currentIndex]=array2[arr2Index];
				currentIndex++;
				arr2Index++;
			}else if(arr1Index < array1.length && arr2Index >= array2.length) {
				mergedArray[currentIndex]=array1[arr1Index];
				currentIndex++;
				arr1Index++;
			}else */
			
			if(arr1Index >= array1.length) {
				mergedArray[currentIndex]=array2[arr2Index];
				arr2Index++;
			}else if(arr2Index >= array2.length) {
				mergedArray[currentIndex]=array1[arr1Index];
				arr1Index++;
			}else if(array1[arr1Index] < array2[arr2Index]) {
				mergedArray[currentIndex]=array1[arr1Index];
				arr1Index++;				
			}else {
				mergedArray[currentIndex]=array2[arr2Index];
				arr2Index++;
			}
			
			currentIndex++;				
			
		}
		
		return mergedArray;
		
		
	}

}
