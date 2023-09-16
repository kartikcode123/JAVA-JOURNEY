package practice;

import java.util.Scanner;

public class DescInsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                
            }
        }
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
        insertionSort(arr);
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+"   ");
        }
    }
}
