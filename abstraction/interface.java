package pack100;
	public interface i1{
		public void run();
	} 
	public interface i2{
		public void walk();
	}
	public interface i extends i1,i2{
		public void sleep();
	}
	
	public class c1 implements i2{
		public void walk(){
			System.out.println("from c1 class walk");
	}
	public class c extends c1 implements i {
		public void sleep();
		System.out.println("from class sleep");
	}
	public void run(){
		System.out.println("from c class run");
	}
}
	
	
