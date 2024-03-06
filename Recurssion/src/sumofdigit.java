public class sumofdigit {

    public static int digitSum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+ digitSum(n/10);


    }

    public static void main(String[] args) {
        int ans = digitSum(645);
        System.out.println(ans);
    }
}
