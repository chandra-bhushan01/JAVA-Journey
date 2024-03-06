public class LinearSearch {


    public static void main(String[] args) {
//        int[] array = new int[]{4,23,56,74};
        int[] a;
        a = new int[]{4,5,632,5,67,23,67,32,632};
        linearSearch(a,632);

    }
    static void linearSearch( int[] array, int target){
        boolean notfound = true;
        for(int i = 0; i<array.length;i++){
            if( array[i] == target){
                System.out.println("The value is at index: "+ i);
                notfound = false;
            }

        }
        if(notfound){
            System.out.println("Elment not found.");
        }


    }
}
