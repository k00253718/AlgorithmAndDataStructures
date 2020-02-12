/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmanddatastructures;

/**
 *
 * @author k00253718
 */
public class Node {

    private Object element;  // element stored in this node
    private Node next; // reference to the next node in the list

    public Node() {
    }
// constructors

    public Node(Object e, Node n) {
//create a node given element and next reference
        element = e;
        next = n;
    }

    public void setElement(Object newElem) {
        element = newElem;
    }

    public void setNext(Node newNext) {
        next = newNext;
    }

// accessor methods
    public Object getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }
} // end of class Node