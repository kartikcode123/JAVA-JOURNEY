package array.doublearray;

import java.util.Scanner;

public class PrefixSum {
   public static void presumMatrix(int [][]arr){
        int m=arr.length;
        int n=arr[0].length;
        //row wise prefix sum
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        //col wise prefixsum
         for(int j=0;j<n;j++){
            for(int i=1;i<m;i++){
                arr[i][j]+=arr[i-1][j];
            }
        }

    }
    public static int sumRegion(int arr[][],int r1,int c1,int r2,int c2){
        int sum=0,up=0,left=0,repeated=0,result=0;
        sum=arr[r2][c2];
        if(r1>0){
        up=arr[r1-1][c2];
        }
        if(c1>0){
        left=arr[r2][c1-1];
        }
        if(r1>0 && c1>0){
        repeated=arr[r1-1][c1-1];
        }
        result=sum-left-up+repeated;
        return result;
    }
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
       int r1,c1,r2,c2;
       System.out.println("enter the value of r1,c1,r2,c2 respectively");
       r1=sc.nextInt();
       c1=sc.nextInt();
       r2=sc.nextInt();
       c2=sc.nextInt();
       presumMatrix(arr);
       int result=sumRegion(arr,r1,c1,r2,c2);
       System.out.println("result is "+result);

    }
    
}
