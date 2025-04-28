class  Mobile{
	String brand;
	double price;
	int storage;
	int ram;
	public Mobile(String brand,double price,int storage,int ram){
		this.brand=brand;
		this.price=price;
		storage=storage;
		ram=ram;
	}
	public void details(){
		System.out.println("brand is:"+brand);
		System.out.println("price is:"+price);
		System.out.println("storage is:"+storage);
		System.out.println("ram is:"+ram);
	}
	public void Game(){
		System.out.println("Enjoy the Game");
	}
}
