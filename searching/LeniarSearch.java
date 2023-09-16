package searching;

import java.util.Scanner;

public class LeniarSearch {
    public static void main(String[] args) {
        int index=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the elements you want to search");
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index :"+index);
        }
    }
    
}
