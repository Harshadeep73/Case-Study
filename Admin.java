package CaseStudy;
import java.util.*;
public class Admin {
    private ArrayList<Advice> record_of_advice;
    
    Admin(){
        record_of_advice = new ArrayList<>();
    }

    public void store_advice(String advice_sent){
        if(!advice_sent.trim().isEmpty()){
            record_of_advice.add(advice_sent);
            return;
        }
    }

    public void display_records(){
       System.out.println("");
       
       for(Advice a : record_of_advice){
          System.out.println(s.get_recommendation());
       }
    }

}
