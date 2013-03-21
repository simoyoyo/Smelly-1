/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proval;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

/**
 *
 * @author Mattia
 */
public class ProvaL implements Deque {

    String nome;
    ProvaL next, prev;

    public ProvaL() {
        next = null;
        prev = null;
    }
    
    public ProvaL(String nome) {
        next = null;
        prev = null;
        this.nome = nome;
    }    

    public static void main(String[] args) {
        ProvaL p = new ProvaL();
        System.out.println(p);
        p.addLast("Uno");
        System.out.println(p);
        p.addLast("Due");
        System.out.println(p);
        p.removeLast();
        System.out.println(p);
    }

    @Override
    public void addFirst(Object e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addLast(Object e) {
        ProvaL l = new ProvaL((String) e);
        ProvaL indice = this;
        if (this.next == null) {
            this.next = l;
            l.prev = l;
            l.next = l;
        }
        l.prev = this.next.prev.prev;
        l.next = this.next;
        l.prev.next = l;
        this.next.prev = l;
    }

    @Override
    public boolean offerFirst(Object e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean offerLast(Object e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object removeFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object removeLast() {
        this.next.prev.prev.next=this.next;
        this.next.prev=this.next.prev;
        return "s";
    }

    @Override
    public Object pollFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object pollLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object peekFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object peekLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean add(Object e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean offer(Object e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object poll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object element() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void push(Object e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator descendingIterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String toString() {
        String s = "ProvaL{";
        if (this.next==null)
            return s+"}";
        ProvaL top=this.next;
        for (top = this.next; top.next != this.next; top = top.next) {
            s += " nome = " + top.nome + ",";
        }
        return s+" nome = " + top.nome +" }";
    }
    
}
