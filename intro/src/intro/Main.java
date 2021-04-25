package intro;

public class Main 
{
	public static void main(String[] args)
	{
		//camelCase
		String internetSubeButonu = "Ýnternet Þubeye gir";	
		
		int vade = 36;
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		
		boolean doru = true;
		boolean yanlüþ = false;
		
		System.out.println(internetSubeButonu);
		int newValue;
		
		if(dolarBugun < dolarDun)
		{
			System.out.println("Dolar Düþtü Sevinin :)");
		}
		else if(dolarBugun == dolarDun)
		{
			System.out.println("Kur Sabit Relaxx :|");
		}
		else
		{
			System.out.println("Dolar Yükseldi Sad :(");
		}
		
		int incrementByTen = 0;
		for(int i = 0; i < 10; i++)
		{
			incrementByTen = Increment(incrementByTen);
		}
		
		System.out.println(incrementByTen);
		System.out.println("");
		int a = RecursiveIncrement(10, 1);
		System.out.println(a);
		System.out.println("");
		//declaring array  
		String array[];  
		
		//initialize an array  
		array= new String[6];  
		
		//adding elements to the array  
		array[0] = "kredi0";
		array[1] = "kredi1";  
		array[2] = "kredi2";
		array[3] = "kredi3";
		array[4] = "kredi4";
		array[5] = "kredi5";
		
		System.out.print("Elements of Array are: ");  
		//iteraton over the array  
		for(int i=0; i< array.length ; i++)   
		{  
			if(i+1 <array.length )
				System.out.print(array[i] +", ");  
			else
				System.out.println(array[i]);  
		}  
		System.out.println("");
		String[] kredilerDynamic = 
			{
				"kredi0",
				"kredi1",
				"kredi2",
				"kredi3",
				"kredi4",
				"kredi5"
			};
		//for each
		for(String kredi: kredilerDynamic)
		{
			System.out.println(kredi);
		}
	
	}
	
	
	
	
	//Mehtods
	
	public static int Increment(int a)
	{
		a = a + 1;
		return a;
	}
	public static int Decrement(int a)
	{
		a = a - 1;
		return a;
	}
	public static int RecursiveIncrement(int a , int b)
	{
		if(b > 10)
		{
			System.out.println("a dönüyor: " + a);
			return a;
		}
		else {
			a = a + 1;
			b++;
			System.out.println("noluyyor a: " + a);
			return RecursiveIncrement(a, b);
		}
	}
}
