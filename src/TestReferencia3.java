
public class TestReferencia3 {
	public static void main(String[] args) {
		Cuenta cuentaDiego = new Cuenta(454,525);
		cuentaDiego.setTitular(new Cliente()); 
		System.out.println(cuentaDiego.getTitular().getNombre());
		cuentaDiego.getTitular().setNombre("Diego");
		System.out.println(cuentaDiego.getTitular().getNombre());
	}
}
