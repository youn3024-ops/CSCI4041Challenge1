package CSCI4041Challenge1;

//Written by YOUN3024

public class BinaryText {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        Tree myTree = new Tree();
        Node myNode = new Node("Test", null, null);
        myTree.insertNode(myNode);
        System.out.println(myTree);
    }
}