package Lab3;

class LinkedListFromHead {

    private Node head;

    public LinkedListFromHead() {
        head = null;
    }

    // добавление с головы
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    private static class Node {
        private final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}

class LinkedListFromTail {

    private Node head;
    private Node tail;

    public LinkedListFromTail() {
        head = null;
        tail = null;
    }

    // добавление с хвоста
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    private static class Node {
        private final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}

public class Example7 {
    public static void main(String[] args) {
        // Создаем список с головы и добавляем элементы
        LinkedListFromHead listFromHead = new LinkedListFromHead();
        listFromHead.add(1);
        listFromHead.add(2);
        listFromHead.add(3);
        listFromHead.add(4);
        System.out.print("Список с головы: ");
        listFromHead.display(); // Ожидаемый вывод: Список с головы: 4 3 2 1

        // Создаем список с хвоста и добавляем элементы
        LinkedListFromTail listFromTail = new LinkedListFromTail();
        listFromTail.add(1);
        listFromTail.add(2);
        listFromTail.add(3);
        listFromTail.add(4);
        System.out.print("\nСписок с хвоста: ");
        listFromTail.display(); // Ожидаемый вывод: Список с хвоста: 1 2 3 4
    }
}