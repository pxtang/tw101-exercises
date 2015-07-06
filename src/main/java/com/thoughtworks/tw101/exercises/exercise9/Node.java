package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareToIgnoreCase(this.name) < 0) { // name after newNode
            if (left == null) {
                left = new Node(nameOfNewNode);
            } else {
                left.add(nameOfNewNode);
            }
        } else {
            if (right == null) {
                right = new Node(nameOfNewNode);
            } else {
                right.add(nameOfNewNode);
            }
        }


    }

    public List<String> names() {
        List<String> nameList = new ArrayList<String>();
        if (left != null)
            nameList.addAll(left.names());
        nameList.add(name);
        if (right != null)
            nameList.addAll(right.names());

        return nameList;
    }
}
