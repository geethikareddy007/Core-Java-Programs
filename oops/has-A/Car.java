class Car{
	String brand;
	double price;
	Engine e;
	public Car(String brand,double price, Engine e){
		this.brand=brand;
		this.price=price;
		this.e=e;
	}
		public void ride(){
			this.e.combustion();	
			System.out.println("Enjoy the ride...");
	}
}
