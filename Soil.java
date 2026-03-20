package CaseStudy;
public class Soil {
    private String name;
    private int soil_fertility;
    
    Soil(String name, int soil_fertility){
        if(name.trim()!=""&&soil_fertility>0&&soil_fertility<=10) {	
        	this.name=name;
        	this.soil_fertility=soil_fertility;
        }
    }
    
    public int get_soil_fertility() {
    	return soil_fertility;
    }
    
    public void fertilize(int fertilizer){
          if(fertilizer > 0 && fertilizer <= 10){
            soil_fertility += fertilizer;
            return;
          }
    }
    
}
