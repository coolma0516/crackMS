package com.mageshuo.algo.randompointer;

import java.util.HashMap;

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Solution {
    // Visited dictionary to hold old node reference as "key" and new node reference as "value"
    HashMap<Node, Node> visited = new HashMap<>();

    public Node getClonedNode(Node node) {
        // if the node exists then
        if (node != null) {
            if(this.visited.containsKey(node)) {
                return this.visited.get(node);
            } else {
                // Otherwise create a new node
                this.visited.put(node, new Node(node.val));
                return this.visited.get(node);
            }
        }
        return null;
    }

    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Node oldNode = head;

        // creating the new head node
        Node newNode = new Node(head.val);
        this.visited.put(oldNode, newNode);

        while(oldNode != null) {
            newNode.random = this.getClonedNode(oldNode.random);
            newNode.next = this.getClonedNode(oldNode.next);
            oldNode = oldNode.next;
            newNode = newNode.next;
        }
        return this.visited.get(head);
    }
}
