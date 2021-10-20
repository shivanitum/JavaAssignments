/*
Create a generic, singly linked list class called SList, which, to keep things simple, does not implement the List interface.

Each Link object in the list should contain a reference to the next element in the list, but not the previous one (LinkedList, in contrast, is a doubly linked list, which means it maintains links in both directions).

Create your own SListIterator which, again for simplicity, does not implement ListIterator. The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.

The only way to insert and remove elements from an SList is through SListIterator. Write code to demonstrate SList.
 */
import java.util.*;
public class Main {
    public static void main(String args[])
    {

        SList<Integer> sList=new SList<Integer>();
        SListIterator<Integer> sListIterator=sList.getIterator(new SListIterator<Integer>());
        sListIterator.insertLink(5);
        sListIterator.insertLink(6);
        sListIterator.insertLink(7);
        System.out.println(sList);
        sListIterator.removeLink(7);
        System.out.println("List after removing the data");
        System.out.println(sList);
    }
}
