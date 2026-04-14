import java.util.*;
class Advice{
    private double waterChange;
    private double pesticideChange;
    private double fertilizerChange;
    private String recommendation;

    Advice(double waterChange, double pesticideChange, double fertilizerChange, int farmer_id, String name){
      this.waterChange = waterChange;
      this.pesticideChange = pesticideChange;
      this.fertilizerChange = fertilizerChange;
      this.recommendation = generate_recommendation(farmer_id, name);
    }

    public void setRecommendation(String recommendation){
        this.recommendation = recommendation;
    }

    public double[] dispense(){
      double[] values = {waterChange,fertilizerChange,pesticideChange};
      return values;
    }

    public String getRecommendation(){
      return recommendation;
    }
}