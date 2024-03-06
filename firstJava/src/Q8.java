import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
//        To find out whether the given String is Palindrome or not.
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int len = str.length();
        String new_str = "";
        for(int i = 0; i<len;i++){
            new_str = str.charAt(i) + new_str;
            System.out.println(new_str);
        }
        if (new_str.equals(str)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
