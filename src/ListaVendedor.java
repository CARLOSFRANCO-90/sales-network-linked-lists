
public class ListaVendedor {
	NodoVendedor head;
	void adicionar( Vendedor v) {
		NodoVendedor nuevoNodo = new NodoVendedor();
		nuevoNodo.vendedor = v;
		
		// la lista esta vacia 
		if(head == nuevoNodo) {
			head = nuevoNodo;
		}
		else { //La lista ya no esta vacia
			NodoVendedor ultimo = head;
			while(ultimo.next !=null) {
				ultimo = ultimo.next;
			}
			
			ultimo.next = nuevoNodo;
		}
	}	
		
		float calcularPorjentajeDescuento() {
			float porcentaje =0;
			int contadorVendedor =0;
			
			NodoVendedor tmp = head;
			
			while(tmp !=null) {
				porcentaje = porcentaje + tmp.vendedor.porjentajeDescuento;
				contadorVendedor++;
				tmp=tmp.next;
				
			}
			
			porcentaje = porcentaje * contadorVendedor /100;
			
			return porcentaje;
		}
		
		float calculaComisionXMiembro() {
			float comision =0;
			int contadorVendedor =0;
			
			NodoVendedor tmp = head;
			
			while(tmp !=null) {
				comision = comision + tmp.vendedor.comisionXMiembro;
				contadorVendedor++;
				tmp=tmp.next;
		    }
			
			comision = comision * contadorVendedor /100;
			return comision;
				
	}

}
