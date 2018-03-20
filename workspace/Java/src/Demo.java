
public class Demo {
	private final String name;
	private final int age;
	private final double salary;
	Demo(){name= "M Anand Bharadwaj";age = 25;salary = 21000;
	 System.out.println("Name is "+name +" Age is "+ age + " salary is "+salary+ " From Constructor");
	}
	Demo(String name,int age,double salary)
	{
		this();
		 //this.name = name;
	    // this.age= age;
	    // this.salary=salary;
	     System.out.println("Name is "+name +" Age is "+ age + " salary is "+salary+ " From Constructor");
		
	}
	
	void method(){
		System.out.println("Name is "+name +" Age is "+ age + " salary is "+ salary +" From method");
		System.out.println("Name is "+this.name +" Age is "+ this.age + " salary is "+this. salary+ " From method");
	}
	public static void main(String args[]){
System.out.println("Hello ");
Demo d = new Demo("Bharadwaj ",25,25000.0);


d.method();

System.out.println("Name is "+d.name +" Age is "+ d.age + " salary is "+d. salary+ " From class");
	}
}
