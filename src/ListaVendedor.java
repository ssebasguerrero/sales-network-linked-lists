
public class ListaVendedor {

	NodoVendedor head;
	
	void insertar(Vendedor v)
	{
		NodoVendedor nuevoNodo = new NodoVendedor();
		nuevoNodo.vendedor = v;
		
		
		if(head == null) //La lista está vacía
		{
			head = nuevoNodo;
		}
		else//La lista no está vacía 
		{ 
			NodoVendedor ultimo = head;
			
			while(ultimo.next != null) 
			{
				ultimo = ultimo.next;			
			}
			ultimo.next = nuevoNodo;
		}
	}
	
}
