
public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(22,12);
		Cuenta cuenta2 = new Cuenta(11,25);
		
		System.out.println(cuenta.getAgencia() + " - " + cuenta.getNumero());
	}
}
