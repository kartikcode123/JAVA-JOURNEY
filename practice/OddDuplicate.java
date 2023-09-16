package practice;

public class OddDuplicate {
    public static void main(String[] args) {
        
   
    /*Given an array Duplicates are present in such a way that all duplicates appear an even number
     of timesexcept one which appear odd number of time find that element*/
     int arr[]={4,3,6,2,6,4,2,3,4,3,3};
     int res=0;
     for(int i=0;i<arr.length;i++){
        res=res^arr[i];
     }
     System.out.println("element is "+res);
}}

