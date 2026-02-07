package CSCI4041Challenge1;

//Written by YOUN3024

public class BinaryText {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        Tree myTree = new Tree();
        Node myNode = new Node("Charlie");
        myTree.insertNode(myNode);
        myNode = new Node("Tango");
        myTree.insertNode(myNode);
        myNode = new Node("Foxtrot");
        myTree.insertNode(myNode);
        myNode = new Node("Zulu");
        myTree.insertNode(myNode);
        myNode = new Node("Hotel");
        myTree.insertNode(myNode);
        myNode = new Node("Mike");
        myTree.insertNode(myNode);
        myNode = new Node("Whiskey");
        myTree.insertNode(myNode);
        System.out.println(myTree);
    }
}