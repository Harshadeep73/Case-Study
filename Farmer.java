import java.util.*;
abstract class Farmer {
   private static int farmer_counter = 1;
   private final int farmer_id;
   private String name, recommendation;
   private double yield;
   private int fertilizer;
   private Soil soil;
   private Crop crop;

   Farmer(String name,String soil_name, int soil_fertility,Crop crop){
	   if(name.trim()!=""&&soil_name.trim()!=""&&soil_fertility>0&&soil_fertility<=100){
		   this.name = name;
		   soil = new Soil(soil_name,soil_fertility);   
		   this.crop = crop;
         farmer_id = farmer_counter;
         farmer_counter++;
	   }
   }
   
   public void set_fertilizer(int fertilizer) {
	   this.fertilizer = fertilizer;
      soil.fertilize(this.fertilizer);
   }

   public double calc_Yield(){
      this.yield = health*10;
      return yield;
   }
   
   public void receive_advice(Advice advice_sent){
	   this.recommendation = advice_sent.recommendation;
      act_on_advice(advice_sent.waterChange, advice_sent.pesticideChange, advice_sent.fertilizerChange);
   }
   
   public void act_on_advice(double waterChange, double pesticideChange, double fertilizerChange){      
       soil.fertilize(fertilizerChange);
       change_Conditions(water+waterChange, crop.get_pesticide()+pesticideChange, soil.get_soil_fertility());
   }
}