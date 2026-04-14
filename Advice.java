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

    private String generate_recommendation(int farmer_id, String name) {
        double waterChange = advice.getwaterChange();
        double pesticideChange = advice.getpesticideChange();
        double fertilizerChange = advice.getfertilizerChange();

        StringBuilder recommendationBuilder = new StringBuilder();

        recommendationBuilder.append("Farmer ID: " + farmer_id + ", Name: " + name + ", ");

        int initialLength = recommendationBuilder.length();

        if (waterChange > 0) {
            recommendationBuilder.append("Increase water by " + waterChange + " units, ");
        } 
        else if (waterChange < 0) {
            recommendationBuilder.append("Reduce water by " + waterChange*-1 + " units, ");
        }

        if (fertilizerChange > 0) {
            recommendationBuilder.append("Add " + fertilizerChange + " units of fertilizer, ");
        }

        if (pesticideChange > 0) {
            recommendationBuilder.append("Increase pesticide by " + pesticideChange + " units, ");
        } 
        else if (pesticideChange < 0) {
            recommendationBuilder.append("Reduce pesticide by " + pesticideChange*-1 + " units, ");
        }

        if (recommendationBuilder.length() == initialLength) {
            return "Farmer ID: " + farmer_id + ", Name: " + name + ": No requirement of any changes!";
        }

        if (recommendationBuilder.substring(recommendationBuilder.length() - 2).equals(", ")) {
            recommendationBuilder.delete(recommendationBuilder.length() - 2, recommendationBuilder.length());
        }

      return recommendationBuilder.toString();
    }

    public double[] dispense(){
      double[] values = {waterChange,fertilizerChange,pesticideChange};
      return values;
    }

    public String getRecommendation(){
      return recommendation;
    }
}