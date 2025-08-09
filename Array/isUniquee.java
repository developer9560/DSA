// find the unique number in a fiven array where all the elemts are being repeated twice with onw value being unique
public class isUniquee{
	public static void main(String[] args){
		int arr[]= {1,2,3,4,5,6,7,8,9,1,2,3,4,6,7,8,9};
		for(int i = 0; i<arr.length;i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					arr[i]= -1;
					arr[j]=-1;
				}
			}
		}
		for(int i = 0; i<arr.length;i++){
			if(arr[i]>=0){
			System.out.println(arr[i]);
			}
		}
	}
}