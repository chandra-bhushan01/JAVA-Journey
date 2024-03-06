
import java.util.Arrays;

public class QuickSort {



    static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j<high;j++){
            //if Element at J is smaller than pivot.
            // then swap j and i.
            if( arr[j]<pivot){
                i++;

                //swap arr[i] and the element smaller then pivot
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;

    }

    static void quickSort(int[] arr ,int  low, int  high){
        if(low< high){
            int pidx = partition(arr,low,high);

            quickSort( arr,low, pidx-1);
            quickSort(arr, pidx+1, high);
        }


    }



    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,7,4,8,6};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }
}
