package practice;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int n=sc.nextInt();
        if((n & 1) ==1){
            System.out.println("number is odd");

        }else{
            System.out.println("number is even");
        }
    }
}
