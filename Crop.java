package CaseStudy;
class Crop {
    private String name; 
	private int water,pesticide;
	//find a way to make insects an ideally final variable or one which doesn't change anyhow.
	private final int water_req, insects;
	private double health;
    
	Crop(String name,int water_req){
	  if(!(name.trim().isEmpty())&& water_req > 0 && water_req<=10) {
		  this.name=name;
		  this.water_req = water_req;
	  }
    }
	public void deploy(int water, int insects, int pesticide, soil_Fertility){
          this.insects = insects;
		  change_Conditions(water, pesticide, soil_Fertility);
	}
	public void change_Conditions(int water,int pesticide, int soil_Fertility){
          this.water = water;
		  this.pesticide = pesticide;
		  calc_health(soil_Fertility);
	}
	
	public int get_water() {
		return water;
	}
	
	public int getwater_req() {
		return water_req;
	}
	
	private void calc_health(int soil_Fertility) {
		double water_Effect  = 10-Math.abs(water-water_req);

		//Need to change the way Insect_effect gets calc'd when pesticide is > than insects. 
		double insect_Effect = Math.max(0, (insects-pesticide));
		health = ((water_Effect + soil_Fertility) / 2.0) * insectEffect;
	}
	
	public void update_health(){
		calc_health(soil_Fertility);
	}	
}