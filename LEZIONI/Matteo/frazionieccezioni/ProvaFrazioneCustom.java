package Matteo.frazionieccezioni;
import java.util.Scanner;

public class ProvaFrazioneCustom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Inserire il numeratore e il denominatore della prima frazione:");
			FrazioneCustom f1 = new FrazioneCustom(sc.nextInt(), sc.nextInt());

			System.out.println("Inserire il numeratore e il denominatore della seconda frazione:");
			FrazioneCustom f2 = new FrazioneCustom(sc.nextInt(), sc.nextInt());

			System.out.println("contaOggetti -> " + FrazioneCustom.contaOggetti);

			System.out.println("f1 -> " + f1.toString());
			System.out.println("f2 -> " + f2.toString());

			System.out.println("f1.piu(f2) -> " + f1.piu(f2));
			System.out.println("f1.meno(f2) -> " + f1.meno(f2));
			System.out.println("f1.per(f2) -> " + f1.per(f2));
			System.out.println("f1.diviso(f2) -> " + f1.diviso(f2));

			System.out.println("f1.equals(f2) -> " + f1.equals(f2));

			System.out.println("contaOggetti -> " + FrazioneCustom.contaOggetti);
		} catch (FrazioneException e) {
			System.err.println("Err: Frazione con denominatore negativo!");
			System.err.println("Messaggio: " + e.getMessage());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.err.println("Err: Frazione con denominatore negativo!");
			System.err.println("Messaggio: " + e.getMessage());
			System.err.println("StackTrace: " + e.getStackTrace());
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Err: generico");
			e.printStackTrace();
		}

		finally{
			System.out.println("...finally THE END");
		}
		
		System.out.println("THE END");
	}

}
