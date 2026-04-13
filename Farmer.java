import java.util.*;
abstract class Farmer {
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
         farmer_id = farmer_counter;
         farmer_counter++;
         System.out.println("Farmer " + name + " is succesfully registered!");
	   }
      else{
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
      this.yield = health*10;
      return yield;
   }
   
   /**
    * @param advice_sent The advice that is sent by the Expert class.
    * 
    * @return nothing
    */

   public void receive_advice(Advice advice_sent){
	   this.recommendation = advice_sent.recommendation;
      act_on_advice(advice_sent.dispence[0], advice_sent.dispence[1], advice_sent.dispence[2]);
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

   public void act_on_advice(double waterChange, double pesticideChange, double fertilizerChange){      
       soil.fertilize(fertilizerChange);
       change_Conditions(water+waterChange, crop.get_pesticide()+pesticideChange, soil.get_soil_fertility());
   }
}