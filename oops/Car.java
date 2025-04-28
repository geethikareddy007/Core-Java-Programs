class Car{
	String brand;
	double price;
	double milage;
	public Car(String brand,double price,double milage){
		this.brand=brand;
		this.price=price;
		this.milage=milage;
	}
	public void dis(){
	System.out.println("brand is:"+ brand);
	System.out.println("price is:"+ price);
	System.out.println("milage is:"+milage);
	}
	public void ride(){
		System.out.println("Enjoy the ride");
	}
}
