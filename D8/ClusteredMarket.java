package D8;


public class ClusteredMarket implements PersonQueue {
    Person queue = null;

    public void addPerson(Person person) {
        insert(person);
        System.out.println("Hi " + person.getName() + " you are the " + this.size() + ". in the queue.\n");
    }


    public void servePerson() {
        System.out.println("Yes can I help " + retrieve().getName() + "?");
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
        Person olderThan65 = findOlderThan(65);
        if (olderThan65 != null) {
            remove(olderThan65);
            return olderThan65;
        } else {
            Person olderThan18 = findOlderThan(18);
            if (olderThan18 != null) {
                remove(olderThan18);
                return olderThan18;
            } else {
                Person nextOne = queue;
                remove(nextOne);
                return nextOne;
            }
        }

    }

    private Person findOlderThan(int age) {
        Person current = queue;
        while (current != null) {
            if (current.getAge() >= age) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    private void remove(Person personRmv) {
        if (queue == null) {
            System.out.println("The queue is empty");
        } else {
            Person previous = findPrevious(personRmv);
            if (previous == null) queue = queue.getNext();
            else previous.setNext(personRmv.getNext());
        }
    }

    private Person findPrevious(Person base) {
        if (base == queue) return null;
        Person current = queue;
        Person previous = queue;
        while (current != null && current != base) {
            previous = current;
            current = current.getNext();
        }
        return previous;
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


    protected void listTheQueue() {
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
