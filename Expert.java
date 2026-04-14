package CaseStudy;
public class Expert{
    private Advice advice;
    
    public void generate_advice(double waterChange, double fertilizerChange, double pesticideChange, int farmer_id, String name){
       advice = new Advice(waterChange,fertilizerChange,pesticideChange,farmer_id,name);
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

    public Advice getAdvice(){
        return advice;
    }
}
