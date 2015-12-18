package Maps;

public class Node {

    private int key;
    private String name;
    private Node next;

    public Node(int key, String name) {
        setKey(key);
        setName(name);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
