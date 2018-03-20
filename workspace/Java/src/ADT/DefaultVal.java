package ADT;

public class DefaultVal {

	public static void main(String[] args) {
		int a= DefaultVal.add(" ",10,11);
		int b =DefaultVal.add("N",10,11,12);
		int c= DefaultVal.add("B",10,11,12,14);
		System.out.println(a+"  "+b+" "+" "+ c);
		
		
		//Object[] o = new Object[3];
		//o[0] = new Integer(10);
		//o[1] = new String("Anand");
		//o[2] = new Double(10.2);
		//for(int i=0; i<o.length;i++){
		//System.out.println(o[i]);}

	}


public static int add(String name,int...a){
	int sum=0;
	for(int i: a){
		sum+= i;
	}
	return sum;
	}
}