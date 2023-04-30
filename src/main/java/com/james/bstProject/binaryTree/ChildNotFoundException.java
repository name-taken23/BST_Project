package com.james.bstProject.binaryTree;

public class ChildNotFoundException extends Exception{
    //Custom exception class to handle children of a node not found
    public ChildNotFoundException(String message) {
        super(message);
    }

}
