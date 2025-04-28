class SwitchWeek{    
	public static void main(String[] args){
		String s="Tuesday";
		switch(s){
			case "Sunday":{
			System.out.println(1);
			}break;
			case "Monday":{
			System.out.println(2);
			}break;
			case "Tuesday":{
			System.out.println(3);	//3
			}break;
			case "Wednesday":{
			System.out.println(4);
			}break;
			case "Thursday":{
			System.out.println(5);
			}break;
			case "Friday":{
			System.out.println(6);
			}break;
			case "Saturday":{
			System.out.println(7);
			}break;
		}
	}
}
/*3)WAP TO PRINT NUMBER OF THE DAY BY READING THE NAME 
OF THE DAY ?
EX : I/P=>TUESDAY O/P=>3
I/P=>SATURDAY O/P=>7 */