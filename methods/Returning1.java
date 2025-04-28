class Returning1{
		public static void main(String[] args){
			for(int i=1; i<=10;i++){
				System.out.println(i);
				if(i==6) break;
			}
			System.out.println("Main End");		//o/p came
		}
	}