class Rectangle1{
	double length;
	double height;
	double width;
	public void area(){
		double area = length*height*width;
		System.out.println("Area of rectangle1 is : "+area);
	}
	public void dis(){
		System.out.println("length is:"+this.length);
		System.out.println("height is:"+this.height);
		System.out.println("width is:"+this.width);
	}
}
