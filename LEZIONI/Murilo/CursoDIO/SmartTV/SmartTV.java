package Murilo.CursoDIO.SmartTV;

public class SmartTV {

    boolean on = false;
    int chanel = 1;
    int volume = 25;

    public void on(){

        on = true; 
    
    }

    public void off(){

        on = false;

    }

    public void moreVol(){

        volume++;
        System.out.println("Increasing the volume to " + volume); 
    
    }

    public void lessVol(){

        volume--; 
        System.out.println("Decreasing the volume to " + volume);
    
    }


    public void changeChanel(int newChanel){

        chanel = newChanel;

    }

}
