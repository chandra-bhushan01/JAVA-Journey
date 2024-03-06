import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
//  write a program to take a number as input and check if its odd or even.
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        if (number %2 ==0){
            System.out.println(number+" is Even.");
        }else{
            System.out.println(number+ " is Odd.");
        }

    }
}
