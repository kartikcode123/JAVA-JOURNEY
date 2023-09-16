package practice;

import java.util.Scanner;

public class Fibbonacci {
    public static int fib(int n){
        int result=0;
        if(n<=1){
            return n;

        }else{
            result=fib(n-1)+fib(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=fib(num);
        System.out.println("result is "+result);
        
    }
}
