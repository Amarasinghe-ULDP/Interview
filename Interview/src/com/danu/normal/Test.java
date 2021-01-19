package com.danu.normal;

public class Test {

	
	  public static void main(String[] args) {
	  
		/*
		 * System.out.println("A"); int i =0, j = 0; int n=4; int A[] = {3,5,1,2}; do {
		 * 
		 * j= i + 1; do { if(A[i]>A[j]) { int temp = A[i]; A[i] = A[j]; A[j] = temp; }
		 * }while(j<n); i++; }while(i<n-1);
		 * 
		 * 
		 * System.out.println(A[0]);
		 */
	  
	  
	  int arr[] = {3,2,1}; 
	  int n=arr.length;
	  int temp=0; 
	  for(int i=0; i<n; i++) {
	  for(int j=1; j<(n-1); j++) {
		  if(arr[j-1]>arr[j]) { 
			  temp = arr[j-1]; 
			  arr[j-1]= arr[j];
			  arr[j] = temp; }
		  } 
	  }
	  
	  for(int i=0; i<arr.length; i++) {
		  System.out.print(arr[i] + " "); 
		  }
	  }
	 

	/*
	 * static void bubbleSort(int[] arr) { int n = arr.length; int temp = 0; for
	 * (int i = 0; i < n; i++) { for (int j = 1; j < (n - i); j++) { if (arr[j - 1]
	 * > arr[j]) { // swap elements temp = arr[j - 1]; arr[j - 1] = arr[j]; arr[j] =
	 * temp; }
	 * 
	 * } }
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { int arr[] = { 3, 60, 35, 2, 45, 320,
	 * 5 };
	 * 
	 * System.out.println("Array Before Bubble Sort"); for (int i = 0; i <
	 * arr.length; i++) { System.out.print(arr[i] + " "); } System.out.println();
	 * 
	 * bubbleSort(arr);// sorting array elements using bubble sort
	 * 
	 * System.out.println("Array After Bubble Sort"); for (int i = 0; i <
	 * arr.length; i++) { System.out.print(arr[i] + " "); }
	 * 
	 * }
	 */
}