package searching;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int []arr,int target){
        int low=0,high=arr.length-1,mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
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
        int index=binarySearch(arr,target);
        System.out.println("element found at index:"+index);
}
}
