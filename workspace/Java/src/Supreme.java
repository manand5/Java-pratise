

public class Supreme {
	String name = "Supreme class String ";
	public String print(){
	
		return "returning "+name;
	}

}
class Super extends Supreme{
	String name = "Super class String ";
	public String print(){
		//this.name = super.name;
		System.out.println(name + super.name + " printing from super class");
		System.out.println();
		return "returning "+name;
	}
}
class Sub extends Super{
	String name = "Sub class String ";
	public String print(){
		//this.name = super.name;
		System.out.println(name + super.name + " printing from sub class");
		System.out.println();
		return "returning "+name;
	}
}
class MainMethod{
	public static void main(String[] args){
		Sub obj = new Sub();
		Super obj1 = new Super();
		Supreme obj2 = new Supreme();
		System.out.println(obj.print() );
		System.out.println(obj1.print());
		System.out.println(obj2.print());
		
		
	}
}