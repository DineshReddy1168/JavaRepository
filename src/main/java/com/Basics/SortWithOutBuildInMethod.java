package com.basics;

public class SortWithOutBuildInMethod {

	public static void main(String[] args) {
		
		int arr[]= {7,2,9,6,5,55,77,33,21,56};  //  7,2,9,6,5,33,21,55,56,77
		int n=arr.length;							//    2,5,6,7,9
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
