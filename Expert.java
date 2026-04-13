package CaseStudy;
public class Expert{
    private Advice advice;
    
    public void generate_advice(double waterChange, double fertilizerChange, double pesticideChange, int farmer_id, String name){
       advice = new Advice(waterChange,fertilizerChange,pesticideChange,farmer_id,name);
    }  

    public Advice getAdvice(){
        return advice;
    }
}
