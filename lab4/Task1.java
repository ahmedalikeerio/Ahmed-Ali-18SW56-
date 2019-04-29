public class Task1{
	public static void  main(String args[]){
		int i,j;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("\n\n");
	for(i=1;i<=5;i++){
		for(j=5;j>=i;j--){
			System.out.print("*");
		}
		System.out.println();
	}
	for(i=1;i<=5;i++){
		for(j=5;j>=i;j--){
			System.out.print(" ");
		}
		 for(j=1;j<i*2;j++){
		 	System.out.print("*");
		 }
	System.out.println();
		
	}
	}
}