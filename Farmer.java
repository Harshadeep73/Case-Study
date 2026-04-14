import java.util.*;
class Farmer {
   private static int farmer_counter = 1;
   private final int farmer_id;
   private String name, recommendation;
   private double yield;
   private double fertilizer;
   private Soil soil;
   private Crop crop;

   Farmer(String name,String soil_name, int soil_fertility,Crop crop){
	   if(!(name.trim().isEmpty())&&!(soil_name.trim().isEmpty())&&soil_fertility>0&&soil_fertility<=100){
		   this.name = name;
		   soil = new Soil(soil_name,soil_fertility);   
		   this.crop = crop;
         farmer_id = farmer_counter++;
         System.out.println("Farmer " + name + " is succesfully registered!");
	   }
      else{
         farmer_id = 0;
         System.out.println("Invalid set of details entered! Try again!");
      }
   }
   
   /**
    * @param fertilizer the fertilizer that's put in.
    * 
    * @return nothing
    */
   public void set_fertilizer(int fertilizer) {
	   this.fertilizer = fertilizer;
      soil.fertilize(this.fertilizer);
   }

   /**
    * @param nothing
    * 
    * @return yield which is health just converted to percentage form.
    */

   public double calc_Yield(){
      this.yield = crop.getHealth()*10;
      return yield;
   }
   
   /**
    * @param advice_sent The advice that is sent by the Expert class.
    * 
    * @return nothing
    */

   public void receive_advice(Advice advice_sent){
	   this.recommendation = advice_sent.recommendation;
      double[] values = advice_sent.dispence();
      act_on_advice(values[0], values[1], values[2]);
   }
   
   /**
    * @param nothing
    * 
    * @return fertilizer the fertilizer that's provided to the crop.
    */
   public double get_fertilizer(){
      return fertilizer;
   }

   /**
    * @param waterChange the change in water according to the expert.
    * @param pesticideChange the change in pesticide according to the expert.
    * @param fertilizerChange the change in fertilizer according to the expert.
    * 
    * @return nothing
    */

   public void act_on_advice(double waterChange, double fertilizerChange, double pesticideChange){      
       soil.fertilize(fertilizerChange);
       crop.change_Conditions(crop.getWater()+waterChange, soil.get_soil_fertility(), crop.getPesticide()+pesticideChange);
   }


   /**
    * @param nothing
    * 
    * @return returns the crop in order to access the crop's getters and setters.
    */

   public Crop getCrop(){
      return crop;   
   }
   
   /**
    * @param nothing
    * 
    * @return returns the soil in order to access its getters and setters.
    */

   public Soil getSoil(){
      return soil;
   }

   /**
    * @param nothing
    * 
    * @return the id for storing and recognition purposes.
    */
   public int getId(){
      return farmer_id;
   }
   
   /**
    * @param nothing
    * 
    * @return the name for better recognition purposes when displaying the records.
    */
   public String getName(){
      return name;
   }
}