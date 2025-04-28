class  ClockUser{
	public static void main(String[] args){
		Clock c1=new Clock(1,12,14);
		c1.showTime();
		//c1.hr=30;
		//c1.min=150;
		//c1.sec=120;
		c1.setHr(22);
		c1.setMin(178);
		c1.setSec(19);
		System.out.println(c1.getHr());
		System.out.println(c1.getMin());
		System.out.println(c1.getSec());
		c1.showTime();
	}
}
/*o/p:-
1:12:14
22
12
19
22:12:19
*/