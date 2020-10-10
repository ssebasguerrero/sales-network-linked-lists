
public class Calcular {
	
	ListaVendedor listaVendedor;
	
	// Saldo de cada uno de los vendedores
	float saldoUnico (Vendedor v) 
	{
		NodoVendedor tmp = listaVendedor.head;
		
		while (tmp != null) {
			
			if (tmp.vendedor.afiliador == null) {
				tmp = tmp.next;
			}else {
				if (tmp.vendedor.afiliador == v.nombre ) {
					v.saldo += tmp.vendedor.saldo * 0.25;
				}
			}
			tmp = tmp.next;
		}
		return v.saldo;
	}
	
	// Saldo total de toda la red
	float saldoTotal (ListaVendedor listaVendedor)
	{
		NodoVendedor tmp = listaVendedor.head;
		float totalSaldo = 0;
		
		while (tmp != null) {
			totalSaldo = saldoUnico(tmp.vendedor);
			tmp = tmp.next;
		}
		return totalSaldo;
	}
	
}
