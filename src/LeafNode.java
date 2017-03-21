/**
 * Created by Pri on 21/03/2017.
 */
public class LeafNode {
    public String classification;
    public double probability;

    public LeafNode(String classification,double probability){
        this.classification = classification;
        this.probability = probability;
    }

    public String toString(){
        return "(Leaf) Class: "+classification+" Prob: "+probability;
    }
}
    