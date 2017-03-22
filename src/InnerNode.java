/**
 * Created by Pri on 21/03/2017.
 */
public class InnerNode implements Node{
    public Node leftNode, rightNode;
    public String attribute;

    public InnerNode(String attr, Node left, Node right){
        this.attribute = attr;
        this.leftNode = left;
        this.rightNode = right;
    }

    public String getAttribute(){
        return attribute;
    }

    public Node getLeftNode(){
        return leftNode;
    }

    public Node getRightNode(){
        return rightNode;
    }

    public String toString(){
        return "(Inner) Attribute:" +attribute;
    }
}
