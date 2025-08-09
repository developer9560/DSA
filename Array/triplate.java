// count the number of tiplets whose sum is equal to the given value x.
public class triplate{
	public static void main(String[] args){
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int x = 12;
		for(int i = 0;i<arr.length ; i++){
			for(int j = i+1; j<arr.length; j++){
				for(int k = j+1; k<arr.length;k++){
					if(arr[i]+arr[j]+arr[k]==x){
						System.out.println("the value of x is the sum of the three numbers are "+arr[i]+" "+arr[j]+" " + " "+ arr[k]);
					}
				}
			}
		}
		
	}
}