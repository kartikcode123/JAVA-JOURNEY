package array.singlearray;

import java.util.Scanner;

public class Reversal {
    public static void reverseArray(int []arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(arr);
        System.out.println("reversed array is");
        for(int m:arr){
            System.out.print(m+"  ");
        }
    }
}
