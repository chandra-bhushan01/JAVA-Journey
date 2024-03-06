package SearchingAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {34,67,23,66,89};
        int place = linearSearch(array,23);
        System.out.println(place);


    }
    static int linearSearch( int[] arr, int target){
        int len = arr.length;
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index < len ; index++){
            int num = arr[index];
            if(num == target){
                return index;

            }
            else{
                return -1;
            }
        }
        return -1;
    }


    };

