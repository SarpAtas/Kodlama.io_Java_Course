package oopders2;

public class Product {
	
	public Product()
	{

	}
	public Product(int id, String name,double unitPrice, String detail)
	{
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
