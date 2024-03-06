import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
//        To calculate Fibonacci Series up to n numbers.
        System.out.println("Enter the term: ");
        Scanner sc = new Scanner(System.in);
        int n_term = sc.nextInt();
        sc.close();
        int sum = 0 ,a =0,b = 1;
        for(int i =1; i<n_term;i++){
            sum = a+b;
            a = b;
            b = sum;


        }
        System.out.println(sum);

    }
}
