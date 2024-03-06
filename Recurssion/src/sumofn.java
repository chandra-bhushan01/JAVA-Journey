public class sumofn {
    public static int sumNumbers(int i){
        if(i==1){
            return 1;

        }
        return i+sumNumbers(i-1);
    }

    public static void main(String[] args) {
        int ans = sumNumbers(5);
        System.out.println(ans);
    }

}
