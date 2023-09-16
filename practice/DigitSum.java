package practice;

import java.util.Scanner;

public class DigitSum {
    public static int findSum(int n){
        if(n==0){
            return 0;
        } 
        else{
            return n%10+findSum(n/10);
        }
        
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=findSum(num);
        System.out.println("result is "+result);
        
    }
}
