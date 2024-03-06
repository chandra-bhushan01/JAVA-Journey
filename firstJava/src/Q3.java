import java.util.Scanner;

public class Q3 {
//    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        float principalAmount = input.nextFloat();
        System.out.println("Enter the Rate (pa): ");
        float rate = input.nextFloat();
        System.out.println("Enter the time in years: ");
        float timeYear = input.nextFloat();

        System.out.println("The interest is "+(principalAmount*timeYear*rate)/100);



    }
}
