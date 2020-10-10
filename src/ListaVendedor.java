

public class ListaVendedor {
	
	NodoVendedor head;
	
	float porjentajeDescuento = 10;
	float comisionInicialXMiembro = 25;
	int valorXMiembro = 1000;
	
	public void anidir(Vendedor vendedor) {
		NodoVendedor nuevoVendedor = new NodoVendedor();
		nuevoVendedor.vendedor = vendedor;
		
		if(head == null) {
			head = nuevoVendedor;
		}
		else {
			NodoVendedor tmp = head;
			while(tmp.next!=null) {
				tmp=tmp.next;
			}
			
			tmp.next = nuevoVendedor;
		}
	}

	
	public void impresionLista(NodoVendedor nodo) {
		if(nodo == null) {
			return;
		}
		
		System.out.println("nombre: " + nodo.vendedor.nombre + " " + "cotaInicial: " 
				+ nodo.vendedor.comisionInicialXMiembro);
	}
	
	public float obtenerSaldoInicial(NodoVendedor nodo) {
		if(nodo == null) {
			return 0;
		}
		
		float valor =0;
		
		NodoVendedor tmp = this.head;
		while(tmp == null) {
			
			valor = tmp.vendedor.valorXMiembro -(tmp.vendedor.valorXMiembro * porjentajeDescuento/100);
					
			System.out.println(" Costo actual " + tmp.vendedor.nombre + " " + valor);
			tmp = tmp.next;
		}
		return valor ;
	}
	
	public int conocerGanancias(NodoVendedor nodo) {
		if(nodo==null) {
			return 0;
		}
		int valor =0;
		int anidir=0;
		NodoVendedor tmp = this.head;
		while (tmp!=null) {
			
			anidir+=(conocerGanancias(nodo.next)*comisionInicialXMiembro/100);
			valor = conocerGanancias(nodo) + anidir;
			
			System.out.println(" Actual saldo " + tmp.vendedor.nombre + " " + valor);
			tmp = tmp.next;
		}
		return valor;
		
	}
	
	public int balanceDeLaRed(NodoVendedor nodo) {
		if(nodo== null) {
			return 0;
		}
		NodoVendedor tmp = this.head;
		int nV =0;
		while(tmp!= null) {
			nV += conocerGanancias(nodo);
			tmp=tmp.next;
		}
		System.out.println(" Saber ganancia: "+ nV);
		return nV;
	}
	
	/*public int mayorSaldo(NodoVendedor nodo) {
		if(nodo==null) {
			return 0;
		}
		NodoVendedor tmp = this.head;
	}
	*/
	
}
