
public class Car {
	int hp;
	Engine myEngine;
	public static void main(String[] a){
		Car myCar = new Car();
		myCar.hp = 120;
		Engine bigEngine = new Engine();
		myCar.myEngine = bigEngine;
		System.out.println(myCar.hp);
	}
	

}
class Engine{}
