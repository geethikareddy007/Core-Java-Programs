class Box{
	int length;
	int width;
	int height;
	public Box(int length,int width,int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public Box(int length,int width){
		this.length=length;
		this.width=width;
	}
	public void details(){
		System.out.println("length is:"+length);
		System.out.println("width is:"+width);
		if(height !=0)
			System.out.println("height is:"+height);
	}
}
