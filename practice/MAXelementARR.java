package practice;

public class MAXelementARR {
    public static int findMax(int a[],int n){
        if(n==0){
            return a[0];
        }else{
            return Math.max(a[n-1],findMax(a, n-1));
        }
    }
    public static void main(String[] args) {
        int arr[]={20,30,10,5,8,7,98,58,65};
        int n=arr.length;
        int result=findMax(arr, n);
        System.out.println(result);
    }
}
