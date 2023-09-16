package array.singlearray;

import java.util.Scanner;
//Find the peak element in array A peak element is that which is greater than its left and right neighbour
public class PeakElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int peak=0;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1]&& arr[i]>arr[i+1]){
                peak=arr[i];
                break;
            }
        }
        System.out.println("peak element is :"+peak);
    }
}
