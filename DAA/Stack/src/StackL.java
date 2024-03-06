import java.util.Stack;

public class StackL {
    Node top;

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    boolean push(int data){
        Node n = new Node(data);
        if(top == null){
            top = n;
            System.out.println("item Pushed");
            return true;
        }else{
            Node temp = top;
            top = n;
            top.next = temp;
            System.out.println("item Pushed");
            return true;
        }
    }


    boolean pop(){
        if(top==null){
             System.out.println("Stack Underflow");
            return false;
        }
        else {
            int n = top.data;
            top = top.next;
            System.out.println("item removed:" + n);
            return true;

        }


    }

    void display(){
        Node temp = top;
        System.out.println("----");
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("----");
    }


    void insAtBotton(int data){
        if (top== null){
            push(data);
            return;
        }
        int top = pop();

    }


    public static void main(String[] args) {
        StackL s = new StackL();
        s.push(34);
        s.push(43);
        s.display();
//        s.pop();
        s.display();


        Stack<Integer> ss = new Stack<>();
        ss.pop();
    }






}
