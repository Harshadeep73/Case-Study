package CaseStudy;
public class Crop {
    private String name; 
	private int health, water, insects, water_req;
    
	Crop(String name, int water,int water_req,int insects){
	  if(name.trim()!=""&&water>0&&water<=10&&insects>0&&insects<=10&&water_req>0&&water_req<=10) {
		  this.name=name;
		  this.water=water;
		  this.insects=insects;
		  this.water_req = water_req;
	  }
    }
	
	public void set_water(int water) {
		this.water = water;
	}
	
	public int get_water() {
		return water;
	}
	
	public int getwater_req() {
		return water_req;
	}
	
	public int calc_health(int soil_fertility) {
		int water_effect  = 10-Math.abs(water-water_req);
		int insect_effect = (10-insects)/10;
		return health=water_effect*insect_effect*soil_fertility;
	}
	
	public void update_health(){
		calc_health(soil_fertility);
	}

	
	
}
