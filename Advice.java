import java.util.*;
class Advice{
    private double waterChange;
    private double pesticideChange;
    private double fertilizerChange;
    private String recommendation;

    Advice(double waterChange, double pesticideChange, double fertilizerChange, int farmer_id){
      this.waterChange = waterChange;
      this.pesticideChange = pesticideChange;
      this.fertilizerChange = fertilizerChange;
      this.recommendation = generate_recommendation(farmer_id);
    }

    private String generate_recommendation(int farmer_id){
        StringBuilder recommendation = new StringBuilder();

        recommendation.append("Farmer id: " + farmer_id + " ");

        
    }

    public double[] dispence(){
      double[] values = {waterChange,pesticideChange,fertilizerChange};
      return values;
    }

    public String get_recommendation(){
      return recommendation;
    }
}