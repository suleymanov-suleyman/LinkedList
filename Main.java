public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.printList();
        linkedList.addFirst(11);
        linkedList.printList();
        linkedList.insertAt(22, 2);
        linkedList.printList();
        linkedList.addLast(5);
        linkedList.printList();
        linkedList.deleteLast();
        linkedList.printList();
        linkedList.deleteFirst();
        linkedList.printList();
    }

}
