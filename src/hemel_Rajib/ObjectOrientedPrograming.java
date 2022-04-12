package hemel_Rajib;

public class ObjectOrientedPrograming {
public static void main(String[] args) {
	
	// to call any data from a different class we have to create an object/instance 
	
	// to create an object we need to put class name then a variable then new class name
	
	Continued cd = new Continued();
	
	//System.out.println(Continued.age+" "+cd.name);
	//System.out.println(cd.name);
//---------------------------------------------------------------------------	

	// reassign with object
	
	//	cd.num = 89494;
//	System.out.println(cd.num);
	
	Continued.age = 21;
	System.out.println(Continued.age);
	






}
}
