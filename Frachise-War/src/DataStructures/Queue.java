/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import Classes.Fighter;

/**
 *
 * @author Sofia
 */
public class Queue {
    private Node head, tail; 
    private int size; 
    
   public Queue() {
       this.head = this.tail = null; 
       this.size = 0; 
   }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
   
    public boolean isEmpty() {
        return this.head == null;
    }
    public void enqueue(Object element) {
        Node nodo = new Node(element); 
        if (isEmpty()) {
            setHead(nodo); 
            setTail(nodo);
        } else {
            getTail().setNext(nodo);
            setTail(nodo); 
        }
        size++; 
    }
    
    public Object dequeue() {
        if (!isEmpty()){
           Node deleted = getHead(); 
           setHead(deleted.getNext()); 
           deleted.setNext(null);
           size--; 
           return deleted.getElement(); 
        }
        return null; 
    }
    public void print() {
        if (!isEmpty()) {
            Node pointer = getHead();
            while (pointer != null) {
                System.out.println(((Fighter)(pointer.getElement())).getId() +" - "+ ((Fighter)(pointer.getElement())).getCharacter().getName() + ""); 
                pointer = pointer.getNext(); 
            
       }

        }
    }

    public int getSize() {
        return size;
    }
    
    
   
}
