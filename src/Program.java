
public class Program {

	public static void main(String[] args) {
		
		ListaVendedor listaVendedor = new ListaVendedor();
		
		listaVendedor.valorXMiembro = 1000;
		listaVendedor.comisionInicialXMiembro = 25;
		listaVendedor.porjentajeDescuento = 10;
		
		System.out.println(" ");
		
		ListaVendedor lista = new ListaVendedor();
		lista.obtenerSaldoInicial(null);
		System.out.println(listaVendedor);
		
	}

}
