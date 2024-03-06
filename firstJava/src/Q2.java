import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
//    Take name as input and print a greeting message for that particular name.
        System.out.println("Enter your Name: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Greetings, "+input.nextLine());
    }
}
