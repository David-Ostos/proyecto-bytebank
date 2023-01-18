
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(12,22);

		miCuenta.depositar(200);

		//System.out.println(miCuenta.saldo);

		miCuenta.depositar(300);

		//System.out.println(miCuenta.saldo);

		miCuenta.retirar(100);

		//System.out.println(miCuenta.saldo);

		Cuenta cuentaDeJimena = new Cuenta(25,85);
		
		cuentaDeJimena.depositar(1000);
		System.out.println(cuentaDeJimena.getSaldo());
		
		cuentaDeJimena.transferir(200, miCuenta);
		
		System.out.println(cuentaDeJimena.getSaldo());
		System.out.println(miCuenta.getSaldo());
	}
}
