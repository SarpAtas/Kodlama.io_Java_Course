package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	
	
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao , LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}


	@Override
	public void add(Product product) {
		if(product.getCategoryID() == 1)
		{
			System.out.println("Item in this category does not accepted");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Product added: " + product.getName());
	}
	
	
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
