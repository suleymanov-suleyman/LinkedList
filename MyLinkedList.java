class MyLinkedList<T> {
    Node<T> head;

    public MyLinkedList() {
        head = null;
    }

    public void add(T data) {
        Node newNode = new Node<T>(data, null);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node<T> temp = head;
    }
}
