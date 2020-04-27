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
//        if(head == null) return null;
//
//        Node oldNode = head;
//
//        // creating the new head node
//        Node newNode = new Node(head.val);
//        this.visited.put(oldNode, newNode);
//
//        while(oldNode != null) {
//            newNode.random = this.getClonedNode(oldNode.random);
//            newNode.next = this.getClonedNode(oldNode.next);
//            oldNode = oldNode.next;
//            newNode = newNode.next;
//        }
//        return this.visited.get(head);
        if (head == null) return null;
        // create new weaved list of original and cloned nodes
        Node ptr = head;
        while (ptr != null) {
            Node newNode = new Node(ptr.val);
            newNode.next = ptr.next;
            ptr.next = newNode;
            ptr = newNode.next;
        }

        ptr = head;
        // Now link the random pointer to the new nodes created
        while (ptr != null) {
            ptr.next.random = (ptr.random != null) ? ptr.random.next : null;
            ptr = ptr.next.next;
        }
        // unweave the list to get back the original list and the cloned list.
        Node ptr_old_list = head;
        Node ptr_new_list = head.next;
        Node head_new = head.next;

        while(ptr_old_list != null) {
            ptr_old_list.next = ptr_old_list.next.next;
            ptr_new_list.next = (ptr_new_list.next != null) ? ptr_new_list.next.next : null;
            ptr_old_list = ptr_old_list.next;
            ptr_new_list = ptr_new_list.next;
        }
        return head_new;
    }
}
