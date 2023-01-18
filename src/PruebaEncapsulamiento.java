
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(12,21);
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("25252525");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cuenta.getTitular().getNombre());
		
		System.out.println(cliente.getNombre()+ " - " + cliente.getDocumento() + " - " + cliente.getTelefono());
	
	}
}
