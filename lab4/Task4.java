import java.util.*;
public class Task4{
	public static void main(String args[]){
		int[][] A=new int[3][3];
		int[][] B=new int[3][3];
		int[][] C=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter values of A:");
		for(int a=0;a<3;a++){
			for(int b=0;b<3;b++){
				A[a][b]=sc.nextInt();
			}
		}
		System.out.print("Enter values of B:");
		for(int a=0;a<3;a++){
			for(int b=0;b<3;b++){
				B[a][b]=sc.nextInt();
			}
		}
		System.out.println("Addition of matrices is: ");
		for(int a=0;a<3;a++){
			for(int b=0;b<3;b++){
				C[a][b]=A[a][b]+B[a][b];
				System.out.println(C[a][b]+"  ");
				System.out.println();
			}
			System.out.println();
		}
		
	}
}