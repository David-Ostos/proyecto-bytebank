
public class testReferencia2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNombre("Diego");
		diego.setDocumento("25252525");;
		diego.setTelefono("4244524586");
		
		Cuenta cuentaDiego = new Cuenta(454,858);
		cuentaDiego.setTitular(diego); 
		System.out.println(diego);
		System.out.println(cuentaDiego.getAgencia());
	}
}
