package org.zl.busyboy;

/**
 * Create by ling.zhang on 2018/9/19.
 */
public class Node<E> {

    E data;
    Node next;

    public Node(E data, Node next) {
        this.data = data;
        this.next = next;
    }
}
