import java.util.*;
public class Task2{
	public static void main(String args[]){
		int a,b;
		Scanner scan =new Scanner(System.in);
		System.out.print("starting point of table:");
		a=scan.nextInt();
		System.out.print("ending point of array:");
		b=scan.nextInt();
		for(int i=a;i<=b;i++){
			System.out.print(a+"*"+i+"= "+(a*i));
			System.out.println();
		}
		
	
	}
}