package Murilo.Exercices.OrarioCustom;

public class ProvaOrarioCustom {
    
    public static void main(String[] args) {

        OrarioCustom o1 = new OrarioCustom();
        OrarioCustom o2 = new OrarioCustom(15, 14);
        OrarioCustom o3 = new OrarioCustom("15:14");

        System.out.println("o1 -> " + o1);
        System.out.println("o2 -> " + o2);
        System.out.println("o3 -> " + o3);


    }


}
