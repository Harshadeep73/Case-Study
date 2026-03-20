package CaseStudy;
import java.util.*;
public class Admin {
    private ArrayList<String> record_of_advice;
    Admin(){
        record_of_advice = new ArrayList<>();
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
