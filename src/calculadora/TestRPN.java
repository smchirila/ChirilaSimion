package calculadora;
import java.util.Scanner;

public class TestRPN {
	/** Metodo main. */
	public static void main(String args[]) {
		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Introduce expresion Postfija o teclea\"fin\".");
			String linea = in.nextLine( );
			if("fin".equals(linea)) {
				System.out.println("Fin de programa");
				break;
			} else {
				RPN calc = new RPN(linea);
				System.out.printf("El resultado es %f\n",
						calc.resultado());
			}	
		} while (true);
	}
}