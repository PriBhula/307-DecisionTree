/**
 * Created by Pri on 21/03/2017.
 */
public class InnerNode implements Node {
    public String classification;
    public double probability;

    public InnerNode(String classification,double probability){
        this.classification = classification;
        this.probability = probability;
    }

    @Override
    public String getClassification() {
        return classification;
    }

    @Override
    public double getProbability() {
        return probability;
    }

    public String toString(){
        return "(Inner) Class: "+classification+" Prob: "+probability;
    }
}
