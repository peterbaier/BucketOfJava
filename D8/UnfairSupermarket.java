package D8;


public class UnfairSupermarket implements PersonQueue {
    Person queue = null;

    public void addPerson(Person person) {
        insert(person);
        System.out.println("Hi " + person.getName() + " you are the " + this.size() + ". in the queue.\n");
    }


    public void servePerson() {
        System.out.println("Yes can I help " + retrieve().getName() + "?");
        System.out.println("Thank you for shopping at us! See you later!\n");
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
        Person oldest = findOldest();
        remove(oldest);
        return oldest;

    }

    private Person findOldest() {
        Person oldest = queue;
        Person current = queue;
        while (current != null) {
            if (current.getAge() > oldest.getAge()) {
                oldest = current;
            }
            current = current.getNext();
        }
        return oldest;
    }

    private void remove(Person personRmv) {
        if (queue == null) {
            System.out.println("The queue is empty");
        } else {
            Person previous = findPrevious(personRmv);
            if (previous == queue) queue = queue.getNext();
            else previous.setNext(personRmv.getNext());
        }
    }

    private Person findPrevious(Person tobeFound) {
        Person found = queue;
        Person previous = queue;
        while (found != null) {
            if (found.equals(tobeFound)) {
                break;
            }
            previous = found;
            found = found.getNext();
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


    private void listTheQueue() {
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


