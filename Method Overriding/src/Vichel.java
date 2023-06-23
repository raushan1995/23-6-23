
public class Vichel {

	void run() {
		System.out.println("vichel is running");
	}
}
class Bike extends Vichel{
	
	void run() {
		System.out.println("bike is running");
	}
	
	public static void main(String args[]) {
		Bike b = new Bike();
		
		b.run();
	}
}
