import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
//        Area Of Circle Java Program
        System.out.println("Enter the radius:");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        sc.close();
        float area = 2*((float) 22 /7)*radius;
        System.out.println("The area of the circle is "+area);
    }
}
