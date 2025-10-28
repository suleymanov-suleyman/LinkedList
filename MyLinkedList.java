class MyLinkedList<T> {
    Node<T> head;

    public MyLinkedList() {
        head = null;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<T>(data, null);
        if (head == null) {
            head = newNode;
            System.out.println("Linked list is empty. New node is now your head node");
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.println("Node added to last");
            temp.next = newNode;
        }
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data, head);
        head = newNode;
        System.out.println("Now new node is first node");
    }

    public void insertAt(T data, T searchedIndexData) {
        Node<T> newNode = new Node<T>(data, null);
        Node<T> temp = head;
        boolean flag = false;
        if (head == null) {
            head = newNode;
            System.out.println("Linked list is empty. New node is now your head node");
            return;
        }
        while (temp.next != null) {
            if (flag) {
                break;
            } else {
                while (temp.data == searchedIndexData) {
                    if (flag) {
                        break;
                    } else {
                        newNode = temp.next;
                        temp.next = newNode;
                        flag = true;
                    }
                }
                temp = temp.next;
            }
        }
        if (flag) {
            System.out.println("Node added next to your desired node!");
        }
        if (!flag) {
            temp.next = newNode;
            System.out.println("Searched node do not founded. New node added next to last node!");
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("LinkedList is empty!");
        }
        Node<T> temp = head;
        System.out.println("LinkedList: ");
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
