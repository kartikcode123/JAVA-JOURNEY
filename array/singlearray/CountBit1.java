package array.singlearray;

import java.util.Scanner;

public class CountBit1 {
     public static int firstOccurrence(int []arr,int target){
        int low=0,high=arr.length-1,mid,result=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                high=mid-1;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
    
        int index=firstOccurrence(arr,1);
        int noOfBit=arr.length-index;
        System.out.println("no. of 1's bit are:"+noOfBit);
}
}
