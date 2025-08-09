// find the unique number in a fiven array where all the elemts are being repeated twice with onw value being unique
public class uniqee{
	public static void main(String[] args){
		int arr[]  = {1,2,3,4,5,6,7,8,9,1,2,3,4,6,7,8,9};
		int num = 0;
		boolean isUniquee = false;
		for(int i = 0 ; i<arr.length; i++){
			isUniquee=false;
			for(int j = i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					isUniquee=true;
					System.out.println("elemts dublicate found "+arr[i]);
				}
			}
			if(isUniquee==false){
				System.out.println(arr[i]);
				break;
			}

		}
		
		
	}
}

