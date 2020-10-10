public class Program {

	public static void main(String[] args) {
	
		ListaVendedor listaVendedor = new ListaVendedor();
		Calcular c = new Calcular();
		
		Vendedor x = new Vendedor();
		x.nombre = "x";
		x.afiliador = null;
		x.saldo = 100;
		listaVendedor.insertar(x);
		
		Vendedor y = new Vendedor();
		y.nombre = "y";
		y.afiliador = "x";
		y.saldo = 100;
		listaVendedor.insertar(y);
		
		Vendedor z = new Vendedor();
		z.nombre = "z";
		z.afiliador = "x";
		z.saldo = 100;
		listaVendedor.insertar(z);
		
		Vendedor y2 = new Vendedor();
		y2.nombre = "y2";
		y2.afiliador = "y";
		y2.saldo = 100;
		listaVendedor.insertar(y2);
		
		// Muestra el saldo total de toda la red
		System.out.println(c.saldoTotal(listaVendedor));
		
		// Muestra el saldo total de un vendedor especifico
		System.out.println(c.saldoUnico(x));
		
		// Muestra el saldo mas bajo
		
	}

}
