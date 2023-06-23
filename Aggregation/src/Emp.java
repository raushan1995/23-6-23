
class Emp {
   int id;
   String name;
   Address address;
public Emp(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
   
   void display() {
	   System.out.println(id+" "+name+" "+address.city+" "+address.state+" "+address.country);
	   
   }
   public static void main(String arg[]) {
	   Address address1 = new Address("patna","bihar","india");
	   Address address2 = new Address("arrah","arrsh","India");
   
   
   Emp e1 = new Emp(1,"raushan",address1);
   Emp e2 = new Emp(2,"monika",address2);
   
   e1.display();
   e2.display();
}
}