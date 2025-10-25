class MyLinkedList<T> {
    Node<T> head;

    public MyLinkedList() {
        head = null;
    }

    public void add(T data) {
        Node newNode = new Node<T>(data, null);
        if (head == null) {
            head = newNode;
            System.out.println("Linked list is empty. New node is now your head node");
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void add(T data, T searchedIndexData) {
        Node newNode = new Node<T>(data, null);
        Node<T> temp = head;
        boolean flag = false;
        if (head == null) {
            head = newNode;
            System.out.println("Linked list is empty. New node is now your head node");
            return;
        }
        while (temp.next != null) {
            while (temp.data == searchedIndexData) {
                newNode = temp.next;
                temp.next = newNode;
                flag = true;
            }
            temp = temp.next;
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
        Node<T> temp = head;
        while (temp.next != null) {
            System.out.println("LinkedList: ");
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
