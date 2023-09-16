package array.doublearray;

import java.util.Scanner;

public class Largest {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of array");
       int m=sc.nextInt();
       int n=sc.nextInt();
       int arr[][]=new int[m][n];
       System.out.println("enter the elements in array");
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
        System.out.println();
       }
       int max=Integer.MIN_VALUE;
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(max<arr[i][j]){
                max=arr[i][j];
            }
        }
       }
       System.out.println("maximum element is"+ max);

     }
}
