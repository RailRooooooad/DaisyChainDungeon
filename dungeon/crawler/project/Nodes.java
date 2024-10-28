/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeon.crawler.project;

/**
 *
 * @author liz10
 */
public class Nodes<T> {
    private Node<T> current;
    private Node<T> head;
    private Node<T> tail;  // New tail reference
    private int size;

    public Nodes()
    {
        current = null;
        size = 0;
    }
    
    
    
    private static class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> prev; 


        private Node(T dataItem, Node<T> nextRef, Node<T> prevRef) {
            data = dataItem;
            this.next = nextRef;
            this.prev = prevRef;
        }
    }

    
    public boolean add(T item) 
    {
        addAtIndex(size, item);
        return true;
    }
    
    public void addAtIndex(int index, T item) 
    {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0) 
        {
            addFirst(item);
        } else if (index == size) 
        {
            addLast(item);
        } else 
        {
            Node<T> node = getNode(index - 1);
            Node<T> newNode = new Node<>(item, node.next, node);
            node.next.prev = newNode;
            node.next = newNode;
            size++;
        }
    }
    
    public void addFirst(T item) 
    {
        Node<T> newNode = new Node<>(item, head, null);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) {  // New list case
            tail = newNode;
        }
        size++;
    }

    public void addLast(T item) 
    {
        Node<T> newNode = new Node<>(item, null, tail);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {  // New list case
            head = newNode;
        }
        size++;
    }

    public T removeFirst() 
    {
        if (head == null) 
        {
            throw new IllegalStateException("List is empty");
        }
        Node<T> temp = head;
        head = head.next;
        if (head != null) 
        {
            head.prev = null;
        } else {
            tail = null;  // List is now empty
        }
        size--;
        return temp.data;
    }

    public T removeAtIndex(int index)
    {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException(index);
        
        if(index==0)
            return removeFirst();
        
        Node<T> prevNode = getNode(index-1);
        return removeAfter(prevNode);
                    
    }
    
    
    public T removeAfter(Node <T> node)
    {
        Node <T> temp = node.next;
        if(temp != null)
        {
            node.next = temp.next;
            size--;
            return temp.data;
        }
        else
            return null;
    }
    
    public T removeLast() 
    {
        if (tail == null) 
        {
            throw new IllegalStateException("List is empty");
        }
        Node<T> temp = tail;
        tail = tail.prev;
        if (tail != null) 
        {
            tail.next = null;
        } else 
        {
            head = null;  // List is now empty
        }
        size--;
        return temp.data;
    }

    
    
    public void makeCircular()//Makes list circular
    {
        if (tail != null) 
        {
            tail.next = head;
            head.prev = tail;
        }
    }
    
    
    private Node<T> getNode(int index) 
    {
        if (index < 0 || index >= size) 
        {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public T get(int index) 
    {
        return getNode(index).data;
    }

    public T set(int index, T newValue) 
    {
        Node<T> node = getNode(index);
        T result = node.data;
        node.data = newValue;
        return result;
    }

    public boolean isCircular() //checks if list is circular
    {
        return size > 0 && tail.next == head;//TEST THIS
    }
    
    public void breakCircular() //removes circular part of list if you want for some reason
    {
        if (isCircular()) {
            tail.next = null;
            head.prev = null;
        }
    }
    
    @Override
    public String toString()
    {
        String output="";
        Node<T> current = head;
        
        //prints every node (such as for inventory)
        for(int i=0; i<size; i++)
        {
            output += current.data + "\n";
            current = current.next;
        }

        return output;
    }

    public int nodeSize()
    {
        return size;
    }
    
    
}

