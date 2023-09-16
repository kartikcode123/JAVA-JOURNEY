package practice;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            if(n%2!=0){
                count++;
            }
            n=n/2;
        }
        if(count==1){
            System.out.println("power of 2");
        }else{
            System.out.println("not power of 2");
        }
    }
}
