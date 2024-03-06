import java.util.Arrays;

public class MergeSort {
    private static void conquer(int[] arr,int[] l, int[] r){
        int i = 0,j = 0, k= 0;
        while (i < l.length && j < r.length) {
            if (l[i] <= r[j]) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        while (i < l.length) {
            arr[k] = l[i];
            i++;
            k++;
        }
        while (j < r.length) {
            arr[k] = r[j];
            j++;
            k++;
        }


    }


    public static void divide(int[] arr) {

        int left = 0;
        int right = arr.length;

        if (arr.length > 1) {
            int mid = (left + right) / 2;

            int[] l = Arrays.copyOfRange(arr, left, mid);
            int[] r = Arrays.copyOfRange(arr, mid, right);

            divide(l);
            divide(r);
            conquer(arr, l, r);
        }
    }




    public static void main (String[]args){
        int[] array = new int[]{23, 4, 5, 6, 7, 32, 5, 7, 54};
        divide(array);
        System.out.println(Arrays.toString(array));

    }




}
