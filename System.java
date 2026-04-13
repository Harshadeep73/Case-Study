package CaseStudy;
public class System {
    private Admin admin;
    private Expert expert;

    System(){
        admin = new Admin();
        expert = new Expert();
    }

    public void process_data(Farmer f){
       
       if(f.crop.health < 10){
          double waterChange = f.crop.get_water()-f.crop.getwater_req();
          double fertilizerChange = f.get
       }
       

       expert.generate_advice()
    }

}
