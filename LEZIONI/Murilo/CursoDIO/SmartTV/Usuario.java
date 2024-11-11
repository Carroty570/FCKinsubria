package Murilo.CursoDIO.SmartTV;

public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTV smartTV = new SmartTV();

        smartTV.changeChanel(13);
        System.out.println("Qual chanel esta? :" + smartTV.chanel);
        

        System.out.println("The tv is on? :" + smartTV.on);
        System.out.println("The volume of the tv? :" + smartTV.volume);
        System.out.println("Qual chanel esta? :" + smartTV.chanel);

        smartTV.on();
        System.out.println("A tv esta on2? :" + smartTV.on);

        smartTV.off();;
        System.out.println("A tv esta on2? :" + smartTV.on);

        smartTV.lessVol();
        smartTV.lessVol();
        System.out.println("The new volume of the tv? :" + smartTV.volume);
        
        smartTV.moreVol();
        System.out.println("The new new volume of the tv? :" + smartTV.volume);
        

    }



}
