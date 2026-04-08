package CaseStudy;
import java.util.*;
public class Admin {
    private ArrayList<Advice> record_of_advice;
    
    
    Admin(){
        record_of_advice = new ArrayList<>();
        record_of_recommmendations = new ArrayList<>();
    }

    public void store_advice(String advice_sent)[
        if(!advice_sent.trim().isEmpty()){
            record_of_advice.add(advice_sent);
            return;
        }
    ]

    public void store_recommendation(String recommendation){
        if(!recommendation.trim().isEmpty()){
            record_of_recommmendations.add(recommendation);
            return;
        }
    }

    public void display_records(){
       System.out.println("");
       
       for(String s : record_of_recommmendations){
          System.out.println(s);
       }
    }

}
