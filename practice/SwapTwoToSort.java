package practice;

public class SwapTwoToSort {
    public static void printArr(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int arr[]={3,8,6,7,5,9,10};
        int n=arr.length;
        printArr(arr,n);
        for (int i = n - 1; i > 0; i--)
    {
        // Check if arr[i]
        // is not in order
        if (arr[i] < arr[i - 1])
        {
            // Find the other element
            // to be swapped with arr[i]
            int j = i - 1;
            while (j >= 0 && arr[i] < arr[j])
                j--;
 
            // Swap the pair
            int temp = arr[i];
            arr[i] = arr[j + 1];
            arr[j + 1] = temp;
     
            break;
        }
    }
    printArr(arr, n);
        }
    }

