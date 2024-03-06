import java.util.Scanner;

public class Q6 {
//    Input currency in rupees and output in USD.
    public static void main(String[] args) {
        System.out.print("Enter currency in Rs: ");
        Scanner input = new Scanner(System.in);
        float rs = input.nextFloat();
        System.out.println("Rs"+rs+" in USD is $"+ rs*1/82);

    }
}
