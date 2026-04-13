package CaseStudy;
import java.util.*;
public class Admin {
    private ArrayList<String> record_of_advice;
    
    Admin(){
        record_of_advice = new ArrayList<>();
    }

    public void storeAdvice(String advice_sent){
        if(!advice_sent.trim().isEmpty()){
            record_of_advice.add(advice_sent);
            return;
        }
    }

    public void displayRecords(){
       System.out.println("");
       
       for(String a : record_of_advice){
          System.out.println(s);
       }
    }

}
