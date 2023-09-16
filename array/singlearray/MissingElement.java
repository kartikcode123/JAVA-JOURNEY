package array.singlearray;

import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sumOfNNatural=((n+1)*(n+2)/2);
        int sum=0;
        for(int m:arr){
            sum+=m;
        }
        int missingElement=sumOfNNatural-sum;
        System.out.println(missingElement);
    }
    
} 
