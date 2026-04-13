package CaseStudy;
public class System {
    private Admin admin;
    private Expert expert;

    System(){
        admin = new Admin();
        expert = new Expert();
    }

    public void process_data(Farmer f){
       double waterChange = 0,fertilizerChange = 0,pesticideChange = 0;

       if(f.crop.health < 10){
          waterChange = f.getCrop().get_water()-f.getCrop().getwater_req();
          fertilizerChange = 10 - f.getCrop().get_soil_fertility;
          pesticideChange  =  f.getCrop().getPesticide() - f.getCrop().getInsects();
       }
       expert.generate_advice();

       admin.storeAdvice(expert.getAdvice());
       farmer.act_on_advice(expert.getAdvice());
    }
    
}
