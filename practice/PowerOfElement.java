package practice;

import java.util.Scanner;

public class PowerOfElement {
    // function definition
    public static int powerFind(int a, int b){
        int mid = 0, result = 0, finalresult = 0;
        // base case condition
        if(b == 1){
            return a;
        }

        else{
            mid = b/2;
            // recursive function call
            result = powerFind(a, mid);
            finalresult = result * result;
            if(b % 2 == 0){
                return finalresult;
            }
            else{
                return a * finalresult;
            }

        }

    }

    public static void main(String[] args){
        // function definition
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // function calling
        int result = powerFind(a,b);
        System.out.println("a^b is "+result);
    }
}
