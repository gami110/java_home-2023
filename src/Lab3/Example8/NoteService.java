package Lab3.Example8;

public class NoteService {

    public static Node createHead(int num) {
        Node node = new Node(0, null);
        Node head = node;
        for (int i = 0; i < num - 1; i++) {
            node.setNext(new Node(i + 1, null));
            node = node.getNext();
        }
        return head;
    }

    public static String toString(Node head) {
        StringBuilder string = new StringBuilder();
        while (head != null) {
            string.append(head.getValue()).append(" ");
            head = head.getNext();
        }
        return string.toString();
    }

    public static Node addFirst(Node head) {
        return new Node(head.getValue() - 1, head);
    }

    public static void addLast(Node node) {
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(new Node(node.getValue() + 1, null));
    }

    public static Node insert(int index, Node node, Node head) {
        int indexMethod = 0;
        Node buffer = head;
        Node headReturn = head;
        while (true) {
            if (index == indexMethod && indexMethod != 0) {
                node.setNext(head);
                buffer.setNext(node);
            } else if (index == indexMethod) {
                node.setNext(head);
                return node;
            }
            indexMethod++;
            buffer = head;
            if (head.getNext() == null) {
                break;
            }
            head = head.getNext();
        }
        return headReturn;
    }

    public static Node removeFirst(Node node) {
        return node.getNext();
    }

    public static void removeLast(Node node) {
        while (node.getNext() != null) {
            node = node.getNext();
            if (node.getNext().getNext() == null) {
                node.setNext(null);
            }
        }
    }

    public static Node remove(int index, Node node) {
        int indexMethod = 0;
        Node returnNode = node;
        Node buffer = node;
        while (true) {
            if (index == indexMethod && indexMethod != 0) {
                buffer.setNext(node.getNext());
            } else if (index == indexMethod) {
                return node.getNext();
            }
            indexMethod++;
            buffer = node;
            if (node.getNext() == null) {
                break;
            }
            node = node.getNext();
        }
        return returnNode;
    }

    public static Node createHeadRec(int num) {
        if (num == 0) {
            return null;
        }
        return new Node(num - 1, createHeadRec(num - 1));
    }

    public static Node createTailRec(int num, Node node) {
        Node node1 = new Node(num - 1, node);
        if (num == 0) {
            return node;
        }
        return createTailRec(num - 1, node1);
    }

    public static String toStringRec(Node head) {
        if (head.getNext() == null) {
            return "";
        }
        return head.getValue() + " " + toStringRec(head.getNext());
    }
}
