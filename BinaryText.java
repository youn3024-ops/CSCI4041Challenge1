package CSCI4041Challenge1;

//Written by YOUN3024

public class BinaryText {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        Tree myTree = new Tree();
        Node myNode = new Node("Charlie", null, null);
        myTree.insertNode(myNode);
        myNode = new Node("Tango", null, null);
        myTree.insertNode(myNode);
        myNode = new Node("Foxtrot", null, null);
        myTree.insertNode(myNode);
        myNode = new Node("Zulu", null, null);
        myTree.insertNode(myNode);
        myNode = new Node("Hotel", null, null);
        myTree.insertNode(myNode);
        myNode = new Node("Mike", null, null);
        myTree.insertNode(myNode);
        myNode = new Node("Whiskey", null, null);
        myTree.insertNode(myNode);
        System.out.println(myTree);
    }
}