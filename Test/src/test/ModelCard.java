
package test;


public class ModelCard {

    public String gettNmae() {
        return tNmae;
    }


    public void settNmae(String tNmae) {
        this.tNmae = tNmae;
    }
    
    public ModelCard(String x){
        this.tNmae = x;
    }
    
    private String tNmae;
    
}
