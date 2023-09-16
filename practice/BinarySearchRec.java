package practice;

import java.util.Scanner;

public class BinarySearchRec {
    public static int binarySearch(int []arr,int low,int high,int x){
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;

          }else if(arr[mid]>x){
           return binarySearch(arr, low, mid-1, x);
        }else{
            return binarySearch(arr, mid+1, high, x);
        }
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr={2,4,6,10,15,27,34,39,45,56};
        int n=arr.length-1;
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int index=binarySearch(arr,0,n,x);
        System.out.println(index);
    }
}
