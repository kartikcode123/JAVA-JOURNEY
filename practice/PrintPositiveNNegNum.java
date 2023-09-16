package practice;

public class PrintPositiveNNegNum {
    public static void printArr(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    
    private static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
    int arr[]={19,-20,7,-4,-13,11,-5,3};
    int n=arr.length;
    printArr(arr,n);
    int pIndex = 0;
 
        // each time we find a negative number, `pIndex` is incremented,
        // and that element would be placed before the pivot
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 0)    // pivot is 0
            {
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
    
 
    
    printArr(arr, n);
}
}
