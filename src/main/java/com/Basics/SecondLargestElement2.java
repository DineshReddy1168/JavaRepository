package com.Basics;
import java.util.*;

class SecondLargestElement2{
    public static void main(String args[]){
        int array[]={2,5,7,3,9,8,9};
        int n=array.length;
        
        int max=array[0];
        int secondValue=Integer.MIN_VALUE;
        
        
        for(int i=1;i<n;i++){
        if(array[i]>max){
        	secondValue=max;
            max=array[i];            
        }
        else if(secondValue>array[i] && array[i]!=max ) {
        	secondValue=array[i];
        }	
        }
        System.out.println(max);        
        System.out.println(secondValue);	

        //ArrayList<Integer> arr=new ArrayList<>();
//      
//      arr.add(1);
//      arr.add(4);
//      arr.add(7);
//      arr.add(5);
//      arr.add(6);
//     Collections.sort(arr,Collections.reverseOrder());
//     System.out.println("Second Largest: "+arr.get(1));
//     
//     
//     //smallest
//
//     int nn=arr.size();
//     System.out.println("Second Smallest: "+arr.get(nn-2));
    }
}