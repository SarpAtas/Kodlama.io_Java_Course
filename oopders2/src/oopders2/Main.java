package oopders2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product(111,"Lenova 15",14000,"Meh PC");

		
		
		Product product2 = new Product();
		product2.name = "Lenova 14";
		product2.id = 112;
		product2.detail = "meh PC 2";
		product2.unitPrice = 11000;
		
		
		Product product3 = new Product();
		product3.name = "Lenova 13";
		product3.id = 113;
		product3.detail = "Meh PC 3";
		product3.unitPrice = 12000;
		
		
		
		Product[] products= {product1,product2,product3};
		
		for(Product product: products)
		{
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "PC";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev bahçe";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);		
		productManager.addToCart(product2);		
		productManager.addToCart(product3);		
	}

}
