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
public class LinkedQueue {

    private Node head, tail;
    private int qSize;

    // constructor
    public LinkedQueue() {
        head = tail = null;
        qSize = 0;
    }

    // accessor methods
    public int size() {
        return qSize;
    }

    public Node getTail() {
        return tail;
    }

    public boolean isEmpty() {
        return (qSize == 0);
    }

    public Object front() {
//		if (isEmpty())
//			System.out.println("Queue is Empty");
//		else
        return head.getElement();
    }

    // update methods
    public void append(Object obj) // insert an element 
    {
        Node node = new Node();
        node.setElement(obj);
        node.setNext(null);     	// node will be new tail node
        if (qSize == 0) {
            head = node;      	// special case of  a previously 					// empty queue
        } else {
            tail.setNext(node); // add node at the tail of the list
        }
        tail = node;    // update the reference to the tail node
        qSize++;
    }

    public Object serve() // Remove the first object from the queue
    {

//		if (qSize == 0)
//		 System.out.println("Queue is empty.");
//		else {
        Object obj = head.getElement();
        head = head.getNext();
        qSize--;

        if (qSize == 0) {
            tail = null; // the queue is now 				   // empty
        }
        return obj;
    }

    public String print() {
        String text = "";
        for (Node i = this.head; i != null; i = i.getNext()) {
            Object element = i.getElement();
            text += element.toString();
            text += " "; // give space between the elements

        }
        return text;
    }

    public void clear() {
        while (!isEmpty()) {
            serve();
        }
    }

    public static void reverse(LinkedQueue queue) {
        LinkedStack stack = new LinkedStack();
        //part1
        while (!queue.isEmpty()) {

            Object data = queue.serve();
            stack.push(data);
        }
        //part2
        while (!stack.isEmpty()) {
            Object data2 = stack.pop();
            queue.append(data2);
        }

    }
} // end of class LinkedQueue

