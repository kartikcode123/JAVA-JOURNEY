package array.singlearray;

import java.util.Scanner;

public class SumElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int m:arr){
            sum+=m;
        }
        System.out.println("sum="+sum);
    }
}
