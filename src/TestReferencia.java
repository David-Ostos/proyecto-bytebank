
public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(78,87);
		primeraCuenta.depositar(200);
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.depositar(100);

		System.out.println(primeraCuenta);
				
		System.out.println(segundaCuenta);
	}
}
