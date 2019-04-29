import java.util.*;
public class Task3{
	public static void main(String[] args) {
		int num;
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of integers:");
		num=input.nextInt();

		for(int a=1; a<=num; a++){

			int take;
			//int sum=0;
			take=input.nextInt();
			sum+=take;
		}
		System.out.println("Sum of all numbers is :"+sum);
		
	}
}