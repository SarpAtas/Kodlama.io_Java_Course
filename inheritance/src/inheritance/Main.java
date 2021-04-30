package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer sarp = new IndividualCustomer();
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		CorporateCustomer iþbank = new CorporateCustomer();
		CorporateCustomer halkbank = new CorporateCustomer();
		
		sarp.id = 12345;
		hepsiBurada.id = 56789;
		iþbank.id = 1111;
		halkbank.id = 2222;
		
		CustomerManager manager = new CustomerManager();
		//manager.add(sarp);
		//manager.add(hepsiBurada);

		
		Customer [] customers = {sarp,hepsiBurada,iþbank,halkbank};
		manager.addMultiple(customers);
	}

}
