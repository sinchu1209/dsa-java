
class SinglyLL {
        Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next= head;
            head = newNode;
        }
        public void insertAtEnd(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;

        }
        public void deleteFromBeginning(){
            if(head==null){
                System.out.println("the List is Empty");
                return;
            }
            head = head.next;
        }
        public void deleteFromEnd(){
            if(head==null){
                System.out.println("the List is Empty");
                return;
            }
            if(head.next==null){
                head= null;
                return;
            }
            Node temp = head;
            while(temp!=null){
                temp=temp.next;
            }
            temp.next = null;
        }
        public boolean search(int key){
            Node temp = head;
            while(temp!=null){
                if(temp.data==key){
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }

        public int countNodes() {
            int count = 0;
            Node temp = head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    

    public static void main(String[] args) {
        SinglyLL sl = new SinglyLL();
        sl.insertAtBeginning(10);
        sl.insertAtBeginning(5);
        sl.insertAtEnd(20);
    

        System.out.println("Linked List:");
        sl.display();

        System.out.println("Count: " + sl.countNodes());

        System.out.println("Search 15: " + sl.search(15));




    }
}