package array.singlearray;

import java.util.Scanner;

public class EvenElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int m:arr){
            if(m%2==0){
                System.out.println("even element found"+m);
            }
        }
    }
}
