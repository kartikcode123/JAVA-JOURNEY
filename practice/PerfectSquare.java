package practice;
import java.util.*;

public class PerfectSquare {
    public static int findSquareRoot(int num){
        int low=0,high=num,mid,result=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            long val=mid*mid;
            if(val==num){
                return mid;
            }else if(val<num){
                result=mid;
                low = mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number you want to find sqaureroot");
        int num=sc.nextInt();
        int result=findSquareRoot(num);
        if(num==(result*result)){
            System.out.println("perfect square");
        }else{
            System.out.println("not a perefct square");
        }
    }
}
