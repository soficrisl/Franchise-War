/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Sofia
 */
public class Queue {
    private Integer head, tail; 
    private int size, maxSize; 
    private Node[] array; 

    public Queue(int maxSize) {
        this.head  = this.tail = null;
        this.size = 0;
        this.maxSize = maxSize;
        this.array = new Node[0];
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public Integer getTail() {
        return tail;
    }
    
    public void setTail(Integer tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Node[] getArray() {
        return array;
    }

    public void setArray(Node[] array) {
        this.array = array;
    }

    public Node[] copyArray() {
        Node[] newArray = new Node[array.length + 1];
        for (int i = 0; i < getArray().length; i++) {
            newArray[i] = getArray()[i];
        }
        return newArray;
    }
    
    public int searchSpace(){
        for (int i = 0; i < getArray().length; i++) {
            if (array[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void enqueue(Object element) {
        Node nodo = new Node(element);
        if (getSize() >= getMaxSize()) {
            System.out.println("Full");
        } else {
            if(isEmpty()) {
                int position = searchSpace();
                if (position == -1) {
                    Node[] newArray = copyArray();
                    newArray[newArray.length-1] = nodo;
                    setHead(newArray.length-1);
                    setTail(newArray.length-1);
                    setArray(newArray);
                } else {    
                    Integer pointer = getHead();
                    while (getArray()[pointer] != null) {
                        if(getArray()[pointer].getNext() != null) {
                            pointer = getArray()[pointer].getNext();
                        } else {
                            break;
                        }
                    }
                    getArray()[pointer].setNext(position);
                    getArray()[position] = nodo;
                    setHead(position);
                    setTail(position);
                }
                size++; 
            } else {
                int position = searchSpace();
                if (position == -1) {
                    Node[] newArray = copyArray();
                    newArray[getTail()].setNext(newArray.length-1);
                    newArray[newArray.length-1] = nodo;
                    setTail(newArray.length-1);
                    setArray(newArray);
                } else { 
                    getArray()[getTail()].setNext(position);
                    getArray()[position] = nodo;
                    setTail(position);
                }
                size++;
            }
        }
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            Node pointer = getArray()[getHead()];
            getArray()[getHead()] = null;
            setHead(pointer.getNext());
            pointer.setNext(null);
            if(isEmpty()) {
                setTail(null);
            }
            size--;
            return pointer.getElement();
        }
        return null;
    }

    public boolean isEmpty() {
        return getHead() == null;
    }
    
    public void print() {
        Node pointer = getArray()[getHead()];
        while (pointer != null) {
            System.out.println("[ "+ pointer.getElement()+ " ]");
            if(pointer.getNext() != null) {
                pointer = getArray()[pointer.getNext()];
            } else {
                break;
            }
            
        }
    
    }
}
