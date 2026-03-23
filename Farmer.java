import java.util.*;
abstract class Farmer {
   private final int farmer_id;
   private String name;
   private double produce,land,yield;
   private int fertilizer;
   private Soil soil;
   private Crop crop;
   private String get_advice;
   Farmer(String name,String soil_name, int soil_fertility,Crop crop){
	   if(name.trim()!=""&&soil_name.trim()!=""&&soil_fertility>0&&soil_fertility<=100){
		   this.name = name;
		   soil = new Soil(soil_name,soil_fertility);   
		   this.crop = crop;
         farmer_id = 
	   }
   }
   
   public void set_fertilizer(int fertilizer) {
	   this.fertilizer = fertilizer;
   }
   
   public void set_land(double land) {
	   if(land > 0) {
		   this.land = land;
		   return;
	   }
   }
   
   public double calc_produce() {
      this.yield = (double)crop.calc_health(soil.get_soil_fertility());
      return produce = yield*this.land;
	}
   
   public void receive_advice(String advice_sent){
	   if(advice_sent.trim()!=""){
		   get_advice = advice_sent;
		   act_on_advice();
	   }
   }
   
   public void act_on_advice() {
	   if(this.get_advice.trim()!=""){
         String[] parts = get_advice.split(":");
            
            //decides the scale of change in the desired variable.
            if(parts[1].equals("Much")){
               int improvement = 2;
            }
            else{
               int improvement = 1;
            }

            //decides the direction of change.
            if(parts[2].equals("Less")){
               improvement *= -1;
            }
            
            //decides the variable in question.
            if(parts[0].equals("Water")){
               crop.set_water(crop.get_water()+improvement);
               return;
            }
            else if(parts[0].equals("Insects")){
               this.fertilizer = improvement;
               soil.fertilize(fertilizer);
               crop.update_health;
               return;
            }    
      }
   }
}
class Vegetable_Farmer extends Farmer{
   
}