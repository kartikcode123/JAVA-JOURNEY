package array.doublearray;

import java.util.Scanner;

public class MidRowCol {
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
       for(int i=0;i<n;i++){
        for(int j=m/2;j<=m/2;j++){
            System.out.print(arr[i][j]+"  ");
        }
       }
       for(int i=0;i<m;i++){
        for(int j=n/2;j<=n/2;j++){
            System.out.print(arr[i][j]+"  ");
        }
       }
    }
}
