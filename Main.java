class SinglyLinkedList{
    class Node{
        String data;
        Node next;
        Node(){
            next=null;
        }
        Node(String data){
            this.data = data;
            next=null;
        }
    }
    private Node head;
    private Node tail;
    SinglyLinkedList(){
        head = new Node();
        tail = head;
    }
    public void add(String data){
        tail.next=new Node(data);
        tail=tail.next;
    }
    public void remove(String string){
        if(head.next==null){
            System.out.println("Empty");
            return;
        }
        Node cur = head.next;
        Node prev = head;
        while(cur!=null){
            if(cur.data.equals(string)){
                if (cur == tail) {
                    tail = prev;
                }
                if(head.next==null){
                    tail=head;
                }
                prev.next=cur.next;
                return;
            }
            cur=cur.next;
            prev=prev.next;
        }
        System.out.println("Not in list");
    }
    public void display(){
        Node cur = head.next;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
}
class DoublyLinkedList{
    class Node{
        String data;
        Node next;
        Node prev;
        Node(){
            next=null;
            prev=null;
        }
        Node(String data){
            this.data = data;
            next=null;
            prev=null;
        }
    }
    Node head;
    Node tail;
    DoublyLinkedList(){
        head= new Node();
        tail=head;
    }
    public void add(String data){
        Node createdNode = new Node(data);
        tail.next=createdNode;
        createdNode.prev=tail;
        tail=tail.next;
    }
    public void remove(String string){
        if(head.next==null){
            System.out.println("Empty");
            return;
        }
        Node cur = head.next;
        while(cur!=null){
            if(cur.data.equals(string)){
                if(cur==head.next){
                    head.next=cur.next;
                    if (head.next != null) {
                        head.next.prev = null;
                    }
                }
                else if (cur == tail) {
                    tail = cur.prev;
                    tail.next=null;
                }
                else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    }
                }
                if (head.next == null) {
                    tail = head;
                }
                return;
            }
            cur=cur.next;
        }
        System.out.println("Not in list");
    }
    public void display(){
        Node cur = head.next;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Testing Singly Linked List
        SinglyLinkedList singly = new SinglyLinkedList();

        // Test removing from empty list
        singly.remove("A");  // Edge Case: Removing from an empty list

        // Adding elements
        singly.add("A");
        singly.add("B");
        singly.add("C");

        System.out.println("Removing not in list:");
        singly.remove("E");

        System.out.println("Before removing:");
        singly.display();

        singly.remove("B");
        System.out.println("After removing B:");
        singly.display();

        singly.remove("A");
        System.out.println("After removing A (first element):");
        singly.display();

        singly.remove("C");
        System.out.println("After removing C (last element):");
        singly.display();

        singly.add("D");
        singly.remove("D");
        System.out.println("After removing the only element D:");
        singly.display();


        System.out.println("=======DOUBLY=======");

        DoublyLinkedList doubly = new DoublyLinkedList();

        doubly.remove("A");

        doubly.add("A");
        doubly.add("B");
        doubly.add("C");

        System.out.println("Removing not in list:");
        doubly.remove("E");

        System.out.println("Before removing:");
        doubly.display();

        doubly.remove("B");
        System.out.println("After removing B:");
        doubly.display();

        doubly.remove("A");
        System.out.println("After removing A (first element):");
        doubly.display();

        doubly.remove("C");
        System.out.println("After removing C (last element):");
        doubly.display();

        doubly.add("D");
        doubly.remove("D");
        System.out.println("After removing the only element D:");
        doubly.display();
    }
}
