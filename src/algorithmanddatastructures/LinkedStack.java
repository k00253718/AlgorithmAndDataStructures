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
public class LinkedStack {

    private Node top;         // reference to the top node
    private int size;      // number of elements in the stack

    public LinkedStack() {     	// Initialize the stack
        top = null;
        size = 0;
    }

    public int size() {
        // Returns the current stack size
        return size;
    }

    public boolean isEmpty() {
// Returns true if the stack is empty
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public Object top() {  // Return the top stack element
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        }

        return top.getElement();
    }

    public void push(Object obj) {
// Push a new object on the stack
        Node n = new Node();
        n.setElement(obj);
        n.setNext(top);
        top = n;
        size++;
    }

    public Object pop() {
// Pop off the top stack element
        Object temp;
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        }
        temp = top.getElement();
        top = top.getNext();       // adjust the top node
        size--;
        return temp;
    }
}