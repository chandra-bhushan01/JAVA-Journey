import java.util.Objects;
import java.util.Scanner;

public class Q4 {
//    Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int first = input.nextInt();
        System.out.println("enter second number");
        int second = input.nextInt();
        System.out.println("enter the operator(+,-,*,/)");
        String operator = input.next();

        if (Objects.equals(operator, "+")){
            System.out.println(first+second);
        } else if (Objects.equals(operator, "-")) {
            System.out.println(first - second);
        }else if (Objects.equals(operator, "*")){
            System.out.println(first *second);
        } else if (Objects.equals(operator, "/")) {
            System.out.println(first/second);

        }else {
            System.out.println("wrong entries.");
        }


    }
}
