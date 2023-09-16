package array.singlearray;
import java.util.Scanner;
public class Palindrome {
    public static String checkPalindrome(int []arr){
        int n=arr.length;
        int f=0;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                f=1;
                break;
            }
        }
        if(f==0){
            return "palindrome";
        }
        else{
            return "no palindrome";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String result=checkPalindrome(arr);
        System.out.println("array is "+result);

    }
}
