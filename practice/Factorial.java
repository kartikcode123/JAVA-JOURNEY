package practice;

import java.util.Scanner;

public class Factorial {
    public static int findFact(int n){
        int result=0;
        if(n==0|| n==1){
            return 1;
        
        }else{
            result=n*findFact(n-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=findFact(num);
        System.out.println("factoial is : "+result);
        
    }
}
