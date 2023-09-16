package array.doublearray;

import java.util.Scanner;

public class RotationMatxix {
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
       //step1-transpose
       for(int i=0;i<m;i++){
        for(int j=i;i<n;i++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
       }
       //step2-swap bw the colms
       for(int i=0;i<m;i++){
        int Rindex=n-1;
        int Lindex=0;
            while(Lindex<Rindex){
                int temp=arr[i][Lindex];
                arr[i][Lindex]=arr[i][Rindex];
                arr[i][Rindex]=temp;
                Lindex++;
                Rindex--;
            }
       }
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+"  ");
        }
        System.out.println();
       }
    }
}
