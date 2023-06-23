
public abstract class Vichel {
 
	abstract void run();
}

class Bike extends Vichel{
	
	void run() {
		System.out.println("Bike is running");
	}
	public static void main(String args[]) {
		Bike b = new Bike();
		
		b.run();
	}
}