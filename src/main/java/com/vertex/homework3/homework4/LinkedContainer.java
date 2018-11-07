package com.vertex.homework3.homework4;

import com.vertex.homework3.Lissiner;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedContainer <E extends Lissiner> implements Iterable<E> ,DesendingIterator<E>{
    private Node<E> firstNode;
    private Node<E> lstNode;
    private  int size=0;
    private static double sizeMustacheLength=0.0;
    private static int sizeMumberOfBrooches=0;

    public static double getSizeMustacheLength() {
        return sizeMustacheLength;
    }

    public static void setSizeMustacheLength(double sizeMustacheLength) {
        LinkedContainer.sizeMustacheLength = sizeMustacheLength;
    }

    public static int getSizeMumberOfBrooches() {
        return sizeMumberOfBrooches;
    }

    public static void setSizeMumberOfBrooches(int sizeMumberOfBrooches) {
        LinkedContainer.sizeMumberOfBrooches = sizeMumberOfBrooches;
    }

    public LinkedContainer() {
        lstNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lstNode);
    }


    public void addLast(E e) {
        Node<E> prev =lstNode;
        prev.setCorrentElement(e);
        lstNode= new Node<E>(null,prev,null);
        prev.setNextElement(lstNode);
        size ++;

    }

    public void addFirst(E e) {
        Node<E> next =firstNode;
        next.setCorrentElement(e);
        firstNode = new Node<>(null,null,next);
        next.setPrevElement(firstNode);
        size++;

    }


    public int size() {
        return size;
    }

    public E getElementBuIndex(int counter) {
        Node<E> target=firstNode.getNextElement();
        for(int i = 0;i<counter;i++){
            target=getNextElement(target);
        }return target.getCorrentElement();
    }
    private Node<E>getNextElement(Node<E> corrent){

        return corrent.getNextElement();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter =0;
            @Override
            public boolean hasNext() {
                return counter<size;
            }

            @Override
            public E next() {
                return getElementBuIndex(counter++);
            }
        };
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public Iterator<E> desendingIterator() {
        return new Iterator<E>() {
            int counter =size-1;
            @Override
            public boolean hasNext() {
                return counter>=0;
            }

            @Override
            public E next() {
                return getElementBuIndex(counter--);
            }
        };
    }

    private static class Node<E>{
        private E correntElement;
        private Node<E> nextElement;
        private Node<E> prevElement;
        Node(E correntElement) {
            this.correntElement = correntElement;
        }
        private Node(E correntElement,Node<E> prevElement,Node<E>nextElement){
            this.correntElement=correntElement;
            this.nextElement= nextElement;
            this.prevElement=prevElement;
        }

        public E getCorrentElement() {
            return correntElement;
        }

        public void setCorrentElement(E correntElement) {
            this.correntElement = correntElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }
    }
}

