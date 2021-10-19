package bai10.bt2MyLinkedList;

import bai10.bt2MyLinkedList.MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        bai10.bt2MyLinkedList.MyLinkedList ll = new bai10.bt2MyLinkedList.MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addLast(1);

//
//        ll.add(5,9);
//        ll.add(4,9);
        ll.printList();
    }

}
