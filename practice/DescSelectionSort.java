package practice;

import java.util.Scanner;

public class DescSelectionSort {
      public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int max_index=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[j]>arr[max_index]){
                    max_index=j;
                }
            }
            if(max_index !=i){
                int temp=arr[max_index];
                arr[max_index]=arr[i];
                arr[i]=temp;
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
        selectionSort(arr);
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+"   ");
        }
    }
}
