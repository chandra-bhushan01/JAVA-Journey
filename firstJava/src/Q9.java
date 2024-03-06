import java.util.Scanner;

public class Q9 {
//    To find Armstrong Number between two given number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting point:");
        int start = sc.nextInt();
        System.out.println("Enter ending point:");
        int end = sc.nextInt();


        for(int i = start; i<=end;i++){
            int temp = i;
            String tempstr = Integer.toString(temp);
            int length = tempstr.length();
            int sum = 0;

            while (temp != 0){
                float rem = temp %10;
                sum = (int) (sum + Math.pow(rem,length));
                temp = temp/10;
            }

            if (sum == i && i != 0){    //In-case the range starts with zero we ll check if i != 0. Because zero is not armstrong number.
                System.out.println(i+ " is Armstrong Number.");
            }
        }




    }
}
