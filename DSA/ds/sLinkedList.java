/**
 * Is a simple implementation of a singly linked list, contains a non-public class to represent the node and is only
 * used on the sLinkedList class itself.
 * The linked list here is implemented as an open-ended (only reference is head, no record of the last node).
 *
 */

import java.lang.*;
import java.util.*;

class Node{

    private int value;
    private Node nextNode;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public Node(Node node){
        this.value = node.getValue();
        this.nextNode = node.getNextNode();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Boolean hasNext(){
        return nextNode.isNull();
    }

    @override
    public boolean equals(Object o) {
        if((o instanceof Node) && o.getValue() == this.value && o.getNextNode() == this.nextNode){
            return true;
        }
        return false;
    }
}

public class sLinkedList {
    private Node head = new Node();
    public void addNodeAtBeginning(Node node) {
        if(!node){
            return;
        }
        if(!head){
            head = node;
            return;
        }
        node.setNextNode(head);
        head = node;
    }

    public void addNodeAtEnd(Node node) {
        if(!node){
            return;
        }
        Node tail = this.getTail();
        tail.setNextNode(node);
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        if(!head){
            return null;
        }
        Node node = head;
        while(node.hasNext()){
            node = node.getNextNode();
        }
        return node;
    }

    public Node getTailRec() {
        if(!head){
            return null;
        }
        Node node = head;
        node = node.getNextNode().isNull() ? return node : return node.getNextNode();
    }

    public Boolean removeNode(Node node) {
        if(!node || !head){
            return false;
        }
        if(head.equals(node)) {
            head = head.getNextNode();
            return true;
        }
        Node previous = head;
        while(previous.getNextNode().hasNext()) {
            if(previous.getNextNode().equals(node)) {
                previous.setNextNode(previous.getNextNode().getNextNode());
                return true;
            }
        }
        return false;
    }

    public Boolean removeNode(int val) {
        if(!node || !head){
            return false;
        }
        if(head.getValue() == val) {
            head = head.getNextNode();
            return true;
        }
        Node previous = head;
        while(previous.getNextNode().hasNext()) {
            if(previous.getNextNode().getValue() == val) {
                previous.setNextNode(previous.getNextNode().getNextNode());
                return true;
            }
        }
        return false;
    }

    public boolean removeNodeRec(int val) {
        if(!head){
            return false;
        }
        if(head.getValue() == val) {
            head = head.getNextNode();
            return true;
        }
        return searchAndDestroy(head, val);
    }

    public Node findNodeRec(Node head, int target) {
        if(!head) {
            return null;
        }

        if(head.getValue() == target) {
            return head;
        }

        return findNodeRec(head.getNextNode(), target);
    }

    static public static final boolean searchAndDestroy(Node prev, int target) {
        if(!prev) {
            return false;
        }
        if(prev.getNextNode().getValue() != target) {
            return searchAndDestroy(prev.getNextNode(), target);
        }
        prev.setNextNode(prev.getNextNode().getNextNode());
        return true;
    }
}