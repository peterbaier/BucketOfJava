package Maps;

public class SpecMap implements SimpleMap {

   Node head = null;

    @Override
    public void put(int key, String name) {
        Node nextNode = new Node(key, name);
        if (isEmpty()) head = nextNode;
        else {
            Node current = head;
            while (current.getNext() != null) {
                if(current.getKey() == key) return;
                else current = current.getNext();
            }
            current.setNext(nextNode);
        }
    }

    @Override
    public String get(int key) {
        if(isEmpty()) return null;
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
