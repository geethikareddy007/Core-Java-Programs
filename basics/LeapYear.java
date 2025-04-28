class LeapYear{	//Imp Program
	public static void main(String[] args){
		int year=2024;
		if((year%4==0) && (year%100!=0) || (year%400==0)){	
				System.out.println(year+" Leap year");
		}
		else {
			System.out.println(year+" Not a leap year");	//o/p came
		}
	}
}
