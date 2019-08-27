// 2.создать строковый LinkedList, наполнить его, потом добавить 2  элемента в начала списка. после чего вывести их всех в консоль начиная с конца
import java.util.LinkedList;
import java.util.ListIterator;


public class List {
    static LinkedList<String> linkedList = new LinkedList<String>();
    static LinkedList<String> linkedListResult = new LinkedList<String>();

    public static void printOut() {
        LinkedList<String> object = new LinkedList<String>();
        linkedList.add("Audi");
        linkedList.add("BMW");
        linkedList.add("Caddilac");
        linkedList.add("Ford");
        linkedList.add("Subaru");
        linkedList.add("Honda");
        System.out.println("Linked list: " + linkedList);
    }

    public static void addItems() {
        linkedList.addFirst("Acura");
        linkedList.addFirst("Aston_Martin");
        System.out.println("Items added: " + linkedList);
    }

    public static void printOutReversed() {
        // Generate an iterator. Start just after the last element.
        ListIterator <String> li = linkedList.listIterator(linkedList.size());
        // Iterate in reverse.
        while (li.hasPrevious()) {
            linkedListResult.add(li.previous());
//
        }
        System.out.println("Reversed: " + linkedListResult);
    }
} //

