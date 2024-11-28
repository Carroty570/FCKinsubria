package Murilo.Exercices.Pianeti;

public class ProvaPianeti {
	
	public static void main(String[] args){
		
		Pianeta[] pianeti = Pianeta.values();
		
		System.out.println("***** SISTEMA SOLARE *****");
		System.out.print("[ ");
		for(int i=0; i < pianeti.length; i++)
			System.out.print(pianeti[i] + " ");
		System.out.println("]");
		
		Pianeta p1 = Pianeta.MERCURIO;
		Pianeta p2 = Pianeta.NETTUNO;
		
		System.out.println("p1 > " + p1.toString());
		System.out.println("p2 > " + p2.name());
		
		//qual è il pianeta più lontano dal Sole?!
		
		if(p1.ordinal() > p2.ordinal())
			System.out.println(p1.name() + " e' piu' lontano dal Sole di " + p2.name());
		else 
			System.out.println(p1.name() + " e' piu' vicino al Sole di " + p2.name());
		
		switch(p1){
			case MERCURIO: 
				System.out.println(p1.name() + " e' il primo pianeta del sistema solare");
				break;
			case VENERE: 
				System.out.println(p1.name() + " e' il secondo pianeta del sistema solare");
				break;
			case TERRA: 
				System.out.println(p1.name() + " e' il terzo pianeta del sistema solare");
				break;
			case MARTE: 
				System.out.println(p1.name() + " e' il quarto pianeta del sistema solare");
				break;
			/*case GIOVE: 
				System.out.println(p1.name() + " e' il quinto pianeta del sistema solare");
				break;*/
			case SATURNO: 
				System.out.println(p1.name() + " e' il sesto pianeta del sistema solare");
				break;
			case URANO: 
				System.out.println(p1.name() + " e' il settimo pianeta del sistema solare");
				break;
			case NETTUNO: 
				System.out.println(p1.name() + " e' il ottavo pianeta del sistema solare");
				break;
			default: 
				System.out.println(p1.name() + " e' il " +  (p1.ordinal()+1) + "° del sistema solare");
		}
		
		System.out.println("Il pianeta successivo a " + p1.name() + " nel sistema solare e' " + p1.successivo());
		System.out.println("Il pianeta successivo a " + p2.name() + " nel sistema solare e' " + p2.successivo());
		
		System.out.println("Il pianeta successivo a " + p1.name() + " nel sistema solare e' " + p1.successivo(p1.ordinal()));
		System.out.println("Il pianeta successivo a " + p2.name() + " nel sistema solare e' " + p2.successivo(p2.ordinal()));
		
		System.out.println("Il pianeta precedente a " + p1.name() + " nel sistema solare e' " + p1.precedente());
		System.out.println("Il pianeta precedente a " + p2.name() + " nel sistema solare e' " + p2.precedente());
		
		System.out.println("Il pianeta precedente a " + p1.name() + " nel sistema solare e' " + p1.precedente(p1.ordinal()));
		System.out.println("Il pianeta precedente a " + p2.name() + " nel sistema solare e' " + p2.precedente(p2.ordinal()));
		
		return; //sottointesa
	}
}