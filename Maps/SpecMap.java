package Maps;

public class SpecMap implements SimpleMap {

   Node head = null;

    @Override
    public void put(int key, String name) {
        Node nextNode = new Node(key, name);
        if (head == null) head = nextNode;
        else {
            Node current = head;
            while (current != null) {
                if(current.getKey() == key) return;
                current = current.getNext();
            }
            current = nextNode;
        }
    }

    @Override
    public String get(int key) {
        if(head == null) return null;
        else return get(key,head);
    }

    @Override
    public void remove(int key) {

    }

    @Override
    public boolean isEmpty() { return head == null; }

    private String get(int key,Node current){
        if(current.getKey() == key) return current.getName();
        else if(current.getNext() == null) return null;
        else return get(key,current.getNext());
    }


}
