class  Student{
	String name;
	int id;
	double tenth;
	double twelth;
	public Student(String name,int id,double tenth){
		this.name=name;
		this.id=id;
		this.tenth=tenth;
	}
	public Student(String name,int id, double tenth,double twelth){
		this.name=name;
		this.id=id;
		this.tenth=tenth;
		this.twelth=twelth;
	}
	public void details(){
		System.out.println("name is:"+name);
		System.out.println("id is:"+id);
		System.out.println("tenth marks is:"+tenth);
		if (twelth !=0)
			System.out.println("twelth marks is:"+twelth);
	}
}
