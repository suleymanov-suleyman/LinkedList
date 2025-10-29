class MyLinkedList<T> {
    Node<T> head;

    public MyLinkedList() {
        head = null;
    }

    public void deleteLast() {
        Node<T> temp = head;
        if (temp == null) {
            System.out.println("Delete Last: " + "LinkedList emtpy! Nothing deleted!");
            return;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Delete Last: " + "Last node deleted");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Delete First: " + "LinkedList emtpy! Nothing deleted!");
            return;
        }
        head = head.next;
        System.out.println("Delete First: " + "First node deleted!");
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<T>(data, null);
        if (head == null) {
            head = newNode;
            System.out.println("Add Last: " + "Linked list is empty. New node is now your head node");
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.println("Add Last: " + "Node added to last");
            temp.next = newNode;
        }
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data, head);
        head = newNode;
        System.out.println("Add First: " + "Now new node is first node");
    }

    public void insertAt(T data, T searchedIndexData) {
        Node<T> newNode = new Node<T>(data, null);
        Node<T> temp = head;
        boolean flag = false;
        if (head == null) {
            head = newNode;
            System.out.println("Insert At: " + "Linked list is empty. New node is now your head node");
            return;
        }
        while (temp != null) {
            if (flag) {
                break;
            } else {
                if (temp.data.equals(searchedIndexData)) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    flag = true;
                }
                temp = temp.next;
            }
        }
        if (flag) {
            System.out.println("Insert At: " + "Node added next to your desired node!");
        }
        if (!flag) {
            System.out.println("Insert At: " + "Searched node do not founded!");
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("Print List: " + "LinkedList is empty!");
            return;
        }
        Node<T> temp = head;
        System.out.println("Print List: ");
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
