
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
//        Queue<Integer> que = new;
        ArrayList<Integer> arr  = new ArrayList<>(10);
        arr.add(34);
        arr.add(32);
        arr.add(24);
        arr.add(89);
        arr.add(34);

        s.add(423);
        Collections.sort(arr);
        s.addAll(arr);
        System.out.println(s);

        System.out.println(arr);


    }

}