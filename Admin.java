package CaseStudy;
import java.util.*;
public class Admin {
    private ArrayList<String> record_of_advice;
    private int farmer_tokens;
    private int expert_tokens;
    
    
    Admin(){
        record_of_advice = new ArrayList<>();
    }

    public int get_farmer_token(){
        if(!farmer_tokens>0){
            farmer_tokens=1;
        }
        farmer_tokens++;
        return farmer_tokens-1;
    }
    
    public int get_expert_token(){
        if(!expert_tokens>0){
            expert_tokens=1;
        }
        expert_tokens++;
        return expert_tokens-1;
    }

    public void store_advice(String advice_sent)[
        if(advice_sent.trim() != ""){
            record_of_advice.add(advice_sent);
            return;
        }
    ]

    public void display_records(){
       System.out.println("");
       
       
       for(String s : record_of_advice){
          System.out.println(s);
       }
    }

}
