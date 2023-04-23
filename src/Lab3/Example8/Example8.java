package Lab3.Example8;

public class Example8 {
    public static void main(String[] args) {
        Node node = NoteService.createHead(5);
        System.out.println(NoteService.toString(node));
        node = NoteService.insert(2, new Node(666, null), node);
        System.out.println(NoteService.toString(node));
        node = NoteService.addFirst(node);
        System.out.println(NoteService.toString(node));
        node = NoteService.removeFirst(node);
        System.out.println(NoteService.toString(node));
        NoteService.addLast(node);
        System.out.println("-----------------");

        Node node2 = NoteService.createHead(4);
        System.out.println(NoteService.toString(node2));
        NoteService.removeLast(node2);
        System.out.println(NoteService.toString(node2));
        node2 = NoteService.remove(2, node2);
        System.out.println(NoteService.toString(node2));

        System.out.println("-----------------");
        Node nodeRec = NoteService.createHeadRec(4);
        assert nodeRec != null;
        System.out.println(NoteService.toStringRec(nodeRec));

        System.out.println("-----------------");
        Node nodeRec1 = NoteService.createTailRec(4, null);
        System.out.println(NoteService.toStringRec(nodeRec1));
    }
}
