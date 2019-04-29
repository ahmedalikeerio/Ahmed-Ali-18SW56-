public class Task5{
	public static void main(String args[]){
		int[] arr={5,7,8,5};
		int hii=0;
		for(int a=1;a<arr.length;a++){
			if(arr[a]>hii){
				hii=arr[a];
			}

			
		}
		System.out.print("Highest num is:"+hii);
	}
}