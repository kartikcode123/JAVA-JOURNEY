package array.singlearray;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0],smax=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
        }
        if(smax<arr[n-1]&&max!=arr[n-1]){
            smax=arr[n-1];
        }
        System.out.println("second largest element is :"+smax);
    }
}
