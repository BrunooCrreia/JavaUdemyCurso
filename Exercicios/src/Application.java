import java.text.Format;

import entities.Product;

public class Application {

	public static void main(String[] args) {
		
		
		
		Product prod = new Product("celular", 1000.00, 55);
		
		double valorDesc = prod.calcDesc();
		
		System.out.println(prod.toString() +"  desctonto"+  valorDesc  +"  valor final "+ prod.calcVenda());
		
		
		
		
		
		
	}

}
