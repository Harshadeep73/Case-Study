import java.util.*;
public class Farmer {
   private String name;
   private double produce,land,yield;
   private int fertilizer;
   private Soil soil;
   private Crop crop;
   String advice;
   
   Farmer(String name,String soil_name, int soil_fertility,Crop crop){
	   if(name.trim()!=""&&soil_name.trim()!=""&&soil_fertility>0&&soil_fertility<=100){
		   this.name = name;
		   soil = new Soil(soil_name,soil_fertility);
		   this.crop = crop;
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
   
   public double calc_produce(int water) {
		return produce = (double)crop.calc_health(soil.get_soil_fertility())*land;
	}
   
   public void receive_advice(String advice_sent){
	   if(advice_sent.trim()!=""){
		   advice = advice_sent;
		   act_on_advice();
	   }
   }
   
   
   public void act_on_advice() {
	   
   }
}
