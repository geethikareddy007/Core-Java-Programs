class CarUser {
	public static void main(String[] args) {
	Car obj=new Car("Tata-nexon",120000.4,30.1);
	obj.ride();
	obj.dis();
	System.out.println("------------");
	Car obj1=new Car("BMW",10000000.0,24.1);
	obj1.ride();
	obj1.dis();
	}
}
/*o/p:-
Enjoy the ride
brand is:Tata-nexon
price is:120000.4
milage is:30.1
------------
Enjoy the ride
brand is:BMW
price is:1.0E7
milage is:24.1
*/
