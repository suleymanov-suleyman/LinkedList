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

    public void add(T data, T searchedIndexData) {
        Node newNode = new Node<T>(data, null);
        Node<T> temp = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (temp.next != null) {
            while (temp.data == searchedIndexData) {

            }
        }
    }

    public void printList() {
        Node<T> temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
