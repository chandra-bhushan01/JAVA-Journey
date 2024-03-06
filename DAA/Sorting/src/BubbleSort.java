import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int [] arr){
        System.out.println("original: "+Arrays.toString(arr));

        int n = arr.length-1;
        boolean swaped = true;
        while(swaped){
            swaped = false;
            for(int i = 0; i<n;i++){
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swaped = true;
                }

            }
            n--;
//            System.out.println(Arrays.toString(arr));

        }
        System.out.println("Sorted array: "+Arrays.toString(arr));

    }


    public static void main(String[] args) {
        int[] arr = new int[]{34,56,23,67,53,70,51};
        bubbleSort(arr);
    }

}
