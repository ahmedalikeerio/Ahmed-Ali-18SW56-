import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task6{
	public static void main(String[] args) throws IOException {
		boolean isPresent=false;
		Integer index=null;
		int arr[]={6,8,9,4,3};
		System.out.println("Enter an Element");
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String input=buf.readLine();
		Integer num=Integer.valueOf(input);
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				isPresent=true;
				index=i;
			}}
			if(isPresent==true){
				System.out.print("Element is at Index of: "+index);
			}else{
				System.out.print("Element not Found");
			}
		
	}
}