class  StudentUser{
	public static void main(String[] args){
		Student obj=new Student("geetha",342,9.0);
		obj.details();
		System.out.println("------------------");
		Student obj1=new Student("geethika", 562,8.8,9.3);
		obj1.details();
		System.out.println("------------");
		Student obj2=new Student("geethu",786,9.3,9.8);
		obj2.details();
	}
}
/*O/p :-
name is:geetha
id is:342
tenth marks is:9.0
------------------
name is:geethika
id is:562
tenth marks is:8.8
twelth marks is:9.3
------------
name is:geethu
id is:786
tenth marks is:9.3
twelth marks is:9.8
*/