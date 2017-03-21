/**
 * Created by Pri on 21/03/2017.
 */
public class InnerNode {
    public String classification;
    public double probability;

    public InnerNode(String classification,double probability){
        this.classification = classification;
        this.probability = probability;
    }

    public String toString(){
        return "(Inner) Class: "+classification+" Prob: "+probability;
    }
}
