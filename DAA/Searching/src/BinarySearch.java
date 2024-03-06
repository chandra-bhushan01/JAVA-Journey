public class BinarySearch {
    static int binarySearch(int [] arr, int key){
        //left is the starting index of the array.
        int left = 0;
        //right is the end index of the array.
        int right = arr.length-1;

        //The loop wi

        while(right >= left){
            int mid  = (left+right)/2;
            if (arr[mid] ==key){
                return mid;
            }
            if(arr[mid]<key){
                left = mid+1;

            }else{
                right = mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = new int[]{2,4,6,7,8,65};
        int index = binarySearch( array, 7);
        System.out.println(index);
    }
}
