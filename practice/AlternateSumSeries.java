package practice;

import java.util.Scanner;

public class AlternateSumSeries {
    public static int sumFind(int n){
        if(n==0){
            return 0;
        }else if(n%2==0){
            return sumFind(n-1)-n;
        }else{
            return sumFind(n-1)+n;
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=sumFind(num);
        System.out.println("result is "+result);
        
    }
}
