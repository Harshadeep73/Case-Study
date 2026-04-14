package CaseStudy;
class Crop {
    private String name; 
	private double water,pesticide,insects;
	private final double water_req;
	private double health;
    
	Crop(String name,double water_req){
	  if(!(name.trim().isEmpty())&& water_req > 0 && water_req<=10) {
		  this.name=name;
		  this.water_req = water_req;
	  }
    }

	/**
	 * @param water water being supplied currently;
	 * @param insects insects that are set unless a new crop is deployed once again
	 * @param pesticide pesticide that is initially used
	 * @param soil_Fertilty the fertility of the soil in which the crop is being grown
	 * 
	 * initially assigns the said parameters and calculates health.
	 *  	
	 * @return nothing
	 */
	
	public void deploy(double water,double insects,double pesticide,double soil_Fertility){
          this.insects = insects;
		  changeConditions(water, pesticide, soil_Fertility);
	}

	/**
	 * @param water the new value (if new) of water being supplied
	 * @param pesticide the new value (if new) of the pesticide used
	 * @param soil_Fertility the new value (if new) of the fertility of the soil
	 * 
	 * used to change the parameters when needed and calculates health
	 * 
	 * @return nothing 
	 */

	public void changeConditions(double water,double pesticide,double soil_Fertility){
          this.water = water;
		  this.pesticide = pesticide;
		  calcHealth(soil_Fertility);
	}
	
	/**
	 * @param soil_Fertility the present soil_Fertility.
	 * health computation by leveraging net effects of all 3 elements: water, insects and soil_Fertility.
	 * @return nothing
	 */
	private void calcHealth(double soil_Fertility) {
		double water_Effect  = 10-Math.abs(water-water_req);
		double insect_Effect = (Math.max(0, (insects-pesticide)));
		health = ((water_Effect+soil_Fertility/2)*(10-insect_Effect))/10;
	}
	
	public double getWater() {
		return water;
	}
	
	public double getWaterReq() {
		return water_req;
	}
	
	public double getPesticide(){
		return pesticide;
	}

	public double getInsects(){
		return insects;
	}	

	public double getHealth(){
		return health;
	}
}