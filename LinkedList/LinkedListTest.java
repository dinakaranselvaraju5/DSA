package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class LinkedListTest {

    public static void main(String[] args) {
        int[] arr = {3,1,4,11,60};
        Node y = new Node(arr[0]);
        System.out.println(y.data);
    }
}