import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }

    private class Node{
        int value;
        Node left = null;
        Node right = null;
        public Node(int value){
            this.value = value;
        }
    }
     private Node root;

    //inserting elements at runtime
    public void populate(Scanner scanner){
        System.out.print("Enter root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of "+ node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("enter the value for left of "+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("enter the value for right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }

    }
    public void display(){
        display(root, "");
    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent +node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree b = new BinaryTree();
        b.populate(scanner);
        b.display();
    }



}
