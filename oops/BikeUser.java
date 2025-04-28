class BikeUser{
	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.brand="Tvs";
		b1.price=200000.0;
		b1.milage=30.0;
		b1.ride();
		b1.display();
		System.out.println("------------------");
		Bike b2=new Bike();
		b2.brand="pulsur";
		b2.price=250000.0;
		b2.milage=50.0;
		b2.ride();
		b2.display();
	}
}

/*o/p:-
Enjoy the ride
--------bike details-------
brand is: Tvs
price is: 200000.0
milage is: 30.0
------------------
Enjoy the ride
--------bike details-------
brand is: pulsur
price is: 250000.0
milage is: 50.0
*/

