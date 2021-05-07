package nLayeredDemo;

import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		
		
		// TODO Later Gonna Be Fixed with  Spring IoC
		ProductService productService = new ProductManager(new AbcProductDao()
				,new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Apple",12,50);
		productService.add(product);
	}

}
