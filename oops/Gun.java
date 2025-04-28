class Gun{
	String modal;
	String type;
	int	 range;
	String color;
	public void shoot(){
		System.out.println("from shoot()......");
	}
	public void display(){
		System.out.println("gun type is: " + this.type);
		System.out.println("gun modal is: " + this.modal);
		System.out.println("gun range is: " + range +" bollets");
		System.out.println("gun color is: " + color);
	}
	
		   
}