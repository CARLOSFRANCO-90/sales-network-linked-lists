
public class Program {

	public static void main(String[] args) {
		
		ListaVendedor listaVendedor = new ListaVendedor();
		Vendedor v1 = new Vendedor();
		listaVendedor.adicionar(v1);
		v1.comisionXMiembro = 25;
		v1.cuotaTotalXMiembro = 1000;
		v1.porjentajeDescuento = 10;
		
		float balance = listaVendedor.calculaComisionXMiembro();
		System.out.println(balance);

	}

}
