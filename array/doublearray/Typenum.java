package array.doublearray;

import java.util.Scanner;

public class Typenum {
    public static void main(String[] args) {
        int PositiveNum=0,NegativeNum=0,OddNum=0;int Even_Num = 0;int Zero_Num = 0;
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
            if(arr[i][j]>0){
                PositiveNum++;
            }
            if(arr[i][j]<0){
                NegativeNum++;
            }
            if(arr[i][j]%2 !=0){
               OddNum++;
            }
            if(arr[i][j]%2==0){
                Even_Num++;
            }
            if(arr[i][j]==0){
                Zero_Num++;
            }
        }
       }
       System.out.println("number of positive numbers="+PositiveNum);
       System.out.println("number of negative numbers="+NegativeNum);
       System.out.println("number of even numbers="+Even_Num);
       System.out.println("number of odd numbers="+OddNum);
       System.out.println("number of zeros ="+Zero_Num);
    }
}
