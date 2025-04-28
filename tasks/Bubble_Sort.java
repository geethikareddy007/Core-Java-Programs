import java.util.Arrays;
public class Bubble_Sort{
	public static void main(String[] args){
		int a[]={1,3,2,5,3,7,8,-1};
		for(int i=1;i<a.length;i++){
			for(int j=0; j<a.length-1;i++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
