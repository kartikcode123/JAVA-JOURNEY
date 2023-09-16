package array.singlearray;

import java.util.Scanner;

public class CountOccurrence {
    //count no of time particular element exist
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
    public static int lastOccurrence(int []arr,int target){
        int low=0,high=arr.length-1,mid,result=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                low=mid+1;
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
        System.out.println("enter the elements you want to search");
        int target=sc.nextInt();
        int firstOcc=firstOccurrence(arr,target);
        int lastOcc=lastOccurrence(arr,target);
        if(firstOcc ==lastOcc && lastOcc==-1){
            System.out.println("element not found");
        }else if(firstOcc==lastOcc){
            System.out.println("target occurs 1 time");
        }else{
            System.out.println("target occurs    "+(lastOcc-firstOcc+1)+"times");
        }
        
}
}
