package Matteo.Lezioni.OrarioCustom;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class OrarioCustom {

    private int ore;
    private int min;

    //CONSTRUTTORE

    public OrarioCustom(int ore, int min){

        this.ore = ore;
        this.min = min;

    }

    public OrarioCustom(){

        GregorianCalendar adesso = new GregorianCalendar();

        ore = adesso.get(Calendar.HOUR_OF_DAY);
        min = adesso.get(Calendar.MINUTE);

    }

    public OrarioCustom(String s){

        ore = Integer.parseInt(s.substring(0,2));
        min = Integer.parseInt(s.substring(3,5));


    }
    

}
