package array.doublearray;
import java.util.Scanner;

public class Ele_up_diognal {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of array");
       int m=sc.nextInt();
       int arr[][]=new int[m][m];
       System.out.println("enter the elements in array");
       for(int i=0;i<m;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
       }
       System.out.println("elements above the secondary diognals are");
       for(int i=0;i<m;i++){
        for(int j=0;j<m;j++){
            if(i+j<m-1){
                System.out.print(arr[i][j]+"  ");
            }
        }
       }
    }
}
