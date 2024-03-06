import java.util.ArrayList;


public class SLinkedList {

    //As the object is a head node is created.
    // head.data  = null at the begining.
    Node head;
    class Node{
        int data;
        Node next;
        public Node( int data) {
            this.data = data;
            this.next = null;
        }
    }



    // searching an element in the linked list.
    //linear search implementation.
    void search(int data){
        Node temp  = head;
        int counter = 1;
        while (temp.next !=null){
            if (temp.data == data){
                System.out.println( data +" is present in the linked list at node: "+counter );
            }
            temp = temp.next;
            counter++;

        }
        System.out.println( data +" isn't present in the linked list.");
    }



    //Fucntion for sorting a linked list
    //Bubble sort implementation.
//    void sort(){
//        ArrayList<Integer> arr = new ArrayList<int>(10);
//        arr.sort();
//
//
//    }
//




    //Function to insert new node into a linked list;
    //Takes the data as an input
    void insertLast(int data){
        Node n = new Node(data);
        if (head ==  null){
            head = n;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    void insertFirst(int data){
        if (head == null){
            Node n = new Node(data);
            head = n;
        }else{
            Node n = new Node(data);
            Node temp = head;
            n.next = temp;
            head = n;
        }
    }


    void insertPos( int idx, int data){
        int c = 1;
        Node temp = head;
        while(c<idx){
            c++;
            temp = temp.next;
        }
        Node curr = temp.next;
        temp.next = new Node(data);
        temp.next.next = curr;
    }



    //Deletion of a node of a SLinked list.
    void deleteLast(){
        Node temp = head;
        while (temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }

    void deleteFirst(){
        if (head ==null){
            System.out.println("linked list is empty.");
        }else{
            //Just move the head pointer to the next node.
            //Unlike C the garbage collector will automatically clean the node.
            head = head.next;
        }
    }



    //Function to traverse through the linked list
    //Takes the head of a linked list as input
    void traverse(){
        Node temp = head;
        while(temp!= null){
            System.out.print( temp.data + " " );
            temp = temp.next;
        }
        System.out.println();

    }


    public static void main(String[] args) {

        SLinkedList arr = new SLinkedList();
        arr.insertLast(2);
        arr.insertLast(40);
        arr.insertFirst(50);
        arr.insertLast(51);
        arr.insertLast(56);
        arr.insertLast(59);
        arr.insertPos(2,44);
        arr.traverse();




    }



}
