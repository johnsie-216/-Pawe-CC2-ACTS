public class CC2_Lab4{
	public static void main (String[]args){
	String name ="jhim";
	int age=5;
	
	if (name=="jhim"||name=="ethan"){
	if (age>4&&age<11){
		System.out.println ("Hamster,Dog");
	} if (age>10&&age<16){
		System.out.println ("Spider,Dog");
	} if (age>16&&age<21){
	System.out.println ("Dog,Snake");
	} if (age==21){
		System.out.println ("none"); 
	
	}
	}
	else if (name =="sally"||name =="joy"){
	if (age>4&&age<11){
		System.out.println ("Hamster,Cat");
	} if (age>10&&age<16){
		System.out.println ("Cat,Rabbit");
	} if  (age>16&&age<21){
		System.out.println ("Cat");
	} if (age==21){
		System.out.println ("none"); 
	}
	}
	}
}