import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String name;

    public SinglyLinkedList() {
        this("linked list");
    }
    public SinglyLinkedList(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }
    public void insertAtFront(E insertItem) {
        ListNode newNode = new ListNode(insertItem);
        if (isEmpty()) { // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNode<E>(insertItem);

        } else { // firstNode refers to new node
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtBack(E insertItem) {
        ListNode newNode = new ListNode(insertItem);
        if (isEmpty()) { // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else { // lastNode refers to new node
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    public Resep pencarianResep(String namaResep) {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return null;
        }

        ListNode<E> current = firstNode;
        Resep pencarian = null;

        while (current != null) {
            if (current.getData() instanceof Resep) {
                Resep resep = (Resep) current.getData();
                if (resep.getNama().equalsIgnoreCase(namaResep)) {
                    pencarian = resep;
                    break;
                }
            }
            current = current.next;
        }

        return pencarian;
    }

    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) { // throw exception if List is empty
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = lastNode.data; // retrieve data being removed
        // update references firstNode and lastNode
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else { // locate new last node
            ListNode<E> current = firstNode;
            // loop while current node does not refer to lastNode
            while (current.next != lastNode) {
                current = current.next;
            }
            lastNode = current; // current is new lastNode
            current.next = null;
        }
        return removedItem; // return removed node data
    }
    public E removeFromStart() throws NoSuchElementException {
        if (isEmpty()) { // throw exception if List is empty
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = firstNode.data; // retrieve data being removed
        // locate firstNode to the next node (this act will make the firstNode disappear)
        firstNode = firstNode.next;

        return removedItem;
    }

    private boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }
        System.out.printf("The %s is: %n", name);
        ListNode<E> current = firstNode;
        // while not at end of list, output current node's data
        while (current != null) {
            System.out.printf("%s\n", current.data);
            current = current.next;
        }

        System.out.println();
    }
}