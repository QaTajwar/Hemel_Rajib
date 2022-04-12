package hemel_Rajib;

public class NestedClass {
	//parent class
	
	int age = 25;
	String name ="rajib";
	static double height = 6.0;
	
	public static void main(String[] args) {
		//parent main method
//		Hello obj = new Hello();
//		
//		
//		obj.name = "Hemel";
//		System.out.println(obj.name);   // non-static
//		
//		Hello.height = 7.0;
//	System.out.println(Hello.height); // after reassigning make sure to sysout under the reassign line
	
	
	NestedClass ob = new NestedClass ();
	
	
	ob.age = 21;
	System.out.println(ob.age);
	
	
	
	
	}

	
	public static class Hello {
		//child class
		int age = 26;
		String name ="tajwar";
		static double height = 6.0;
	
		
		public static void main(String[] args) {
			//child main method
			
			NestedClass hi = new NestedClass();
//		
//		   hi.age = 20;
//	       System.out.println(hi.age);
//	       
//	       hi.name = "Fouzia";
//	       System.out.println(hi.name);
	
	
			Hello yo = new Hello();
			
			
			
//			yo.name = "Ismat";
//			System.out.println(yo.name);
//			yo.age = 21;
//		    System.out.println(yo.age);
		    
		    Hello.height = 5.5;
		System.out.println(Hello.height);
		}
	
	
	}
	
	
}
