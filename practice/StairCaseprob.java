package practice;

import java.util.Scanner;

public class StairCaseprob {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=Fibbonacci.fib(n+1);
        System.out.println("number of ways :"+result);
    }
    
}
