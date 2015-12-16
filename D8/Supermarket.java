package D8;


public class Supermarket implements PersonQueue {
    Person queue = null;

    public void addPerson(Person person) {
        insert(person);
        System.out.println("Hi " + person.getName() + " you are the " + this.size() + ". in the queue.\n");
    }


    public void servePerson() {
        System.out.println("Yes can I help " + queue.getName() + "?");
        retrieve();
        System.out.println("Thank you for shopping at us! See you later!");
    }

    @Override
    public void insert(Person newPerson) {
        if (queue == null) queue = newPerson;
        else {
            Person current = queue;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newPerson);
        }
    }

    @Override
    public Person retrieve() {
        if (queue == null) return null;

        Person nextOne = queue;
        queue = queue.getNext();

        return nextOne;

    }

    private int size() {
        int sum = 0;
        if (queue == null) return sum;
        else sum++;
        Person current = queue;
        while (current.getNext() != null) {
            current = current.getNext();
            sum++;
        }
        return sum;
    }

    public void listTheQueue() {
        if (queue == null) System.out.println("Nothing to print!");
        else {
            Person current = queue;
            while (current != null) {
                System.out.println(current.getName());
                current = current.getNext();
            }
        }
    }
}
