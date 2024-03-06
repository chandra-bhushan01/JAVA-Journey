import java.util.Arrays;

public class StackA {

    int[] arr = new int[500];
    int top = -1;


    boolean push(int data){
        if (top == arr.length-1){
            System.out.println("Stack overflow");
            return false;
        }
        else{
            top++;
            this.arr[top] = data;
            System.out.println("item pushed");
            return true;

        }


    }
    boolean pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return false;
        }else{
            top--;
            System.out.println("Item Popped");
            return true;

        }
    }


    boolean isEmpty(){
        if(top == -1){
            System.out.println("Stack is Empty.");
            return true;

        }else {
            System.out.println("Stack isn't Empty.");
            return false;
        }
    }
     void display(){
         System.out.println("------");
         for (int i = top; i >=0; i--) {
             System.out.println(arr[i]);

         }
         System.out.println("------");

    }

    public static void main(String[] args) {
        StackA ele = new StackA();
        ele.push(23);
        ele.push(40);
        ele.push(89);
        ele.push(20);
        ele.pop();
        ele.isEmpty();
        ele.display();

    }




}
