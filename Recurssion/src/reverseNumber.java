public class reverseNumber {

    static int sum = 0;
    public static void numRev(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum =  sum*10+ rem;
        numRev(n/10);
    }

    public static void main(String[] args) {
        numRev(10436822);
        System.out.println(sum);
    }

}
