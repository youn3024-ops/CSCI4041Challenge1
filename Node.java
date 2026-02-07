package CSCI4041Challenge1;

//Written by YOUN3024

public class Node {
    private String leftName;
    private String rightName;
    private String tempName;

    private Node leftChild;
    private Node centerChild;
    private Node rightChild;

    private Node parent;

    public Node(String leftName, String rightName, Node leftChild, Node centerChild, Node rightChild){
        this.leftName = leftName;
        this.rightName = rightName;

        this.leftChild = leftChild;
        this.centerChild = centerChild;
        this.rightChild = rightChild;

        this.parent = null;
    }
    public Node(String onlyName, Node leftChild, Node centerChild, Node rightChild){
        this.leftName = onlyName;
        this.rightName = null;

        this.leftChild = leftChild;
        this.centerChild = centerChild;
        this.rightChild = rightChild;

        this.parent = null;
    }
    public Node(String leftName, String rightName){
        this.leftName = leftName;
        this.rightName = rightName;

        this.leftChild = null;
        this.centerChild = null;
        this.rightChild = null;

        this.parent = null;
    }
    public Node(String onlyName){
        this.leftName = onlyName;
        this.rightName = null;

        this.leftChild = null;
        this.centerChild = null;
        this.rightChild = null;

        this.parent = null;
    }

    public String getVal(int idx){
        if(idx == 0){
            return this.leftName;
        }
        return this.rightName;
    }
    public String[] getVals(){
        return new String[] {this.leftName, this.rightName};
    }
    public boolean setVal(String newVal, int idx){
        if(idx == 0){
            this.leftName = newVal;
        }
        this.rightName = newVal;
        return true;
    }
    public boolean setVals(String[] newVals){
        this.leftName = newVals[0];
        this.rightName = newVals[1];
        return true;
    }

    public Node getParent(){
        return this.parent;
    }
    public boolean setParent(Node newNode){
        this.parent = newNode;
        return true;
    }

    public Node getLeft(){
        return this.leftChild;
    }
    public boolean setLeft(Node newNode){
        if(this.leftChild == null){
            this.leftChild = newNode;
            return true;
        }
        Node grandLeft = this.leftChild.getLeft();
        Node grandCenter = this.centerChild.getCenter();
        Node grandRight = this.rightChild.getRight();
        this.leftChild = newNode;
        this.leftChild.setLeft(grandLeft);
        this.leftChild.setCenter(grandCenter);
        this.leftChild.setRight(grandRight);
        this.leftChild.setParent(this);
        return true;
    }

    public Node getCenter(){
        return this.centerChild;
    }
    public boolean setCenter(Node newNode){
        if(this.centerChild == null){
            this.centerChild = newNode;
            return true;
        }
        Node grandLeft = this.leftChild.getLeft();
        Node grandCenter = this.centerChild.getCenter();
        Node grandRight = this.rightChild.getRight();
        this.centerChild = newNode;
        this.centerChild.setLeft(grandLeft);
        this.centerChild.setCenter(grandCenter);
        this.centerChild.setRight(grandRight);
        this.centerChild.setParent(this);
        return true;
    }

    public Node getRight(){
        return this.rightChild;
    }
    public boolean setRight(Node newNode){
        if(this.rightChild == null){
            this.rightChild = newNode;
            return true;
        }
        Node grandLeft = this.rightChild.getLeft();
        Node grandCenter = this.rightChild.getCenter();
        Node grandRight = this.rightChild.getRight();
        this.rightChild = newNode;
        this.rightChild.setLeft(grandLeft);
        this.rightChild.setCenter(grandCenter);
        this.rightChild.setRight(grandRight);
        this.rightChild.setParent(this);
        return true;
    }

    public String toString(){
        return this.leftName + ", " + this.rightName;
    }
    public String toString(int idx){
        if (idx==0){
            return this.leftName;
        }
        return this.rightName;
    }
}