package array.doublearray;

import java.util.Scanner;

public class Diognal {
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
       }
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(i==j || i+j==n-1){
                System.out.print(arr[i][j]+"   ");
            }
        }
    }

    }
}
