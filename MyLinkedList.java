class MyLinkedList<T> {
    Node<T> head;

    public MyLinkedList() {
        head = null;
    }

    public void add(T data) {
        if (head == null) {
            Node newNode = new Node<T>(data, null);
            head = newNode;
        }
    }
}
