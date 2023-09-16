package practice;

public class SumElementUsingRec {
    public static int findSumrec(int a[],int n){
        if(n==0){
            return 0;
        }else{
            return a[n-1]+findSumrec(a, n-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={20,30,65};
        int n=arr.length;
        int result=findSumrec(arr, n);
        System.out.println(result);
    }
}
