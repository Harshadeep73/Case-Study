class Advice{
    private double waterChange;
    private double pesticideChange;
    private double fertilizerChange;
    private String recommendation;

    Advice(double waterChange, double pesticideChange, double fertilizerChange){
      this.waterChange = waterChange;
      this.pesticideChange = pesticideChange;
      this.fertilizerChange = fertilizerChange;
      this.recommendation = generate_recommendation();
    }

    private String generate_recommendation(){
        
    }

    public double[] dispence(){
      double[] values = {waterChange,pesticideChange,fertilizerChange};
      return values;
    }

    public String get_recommendation(){
      return recommendation;
    }
}