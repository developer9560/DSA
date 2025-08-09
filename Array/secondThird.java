package Array;

// find the second and third largest number;
public class secondThird{
	public static void main(String[] args){
		int[] arr = {2,3,5,1,6,9,3,6,7,8};
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third =Integer.MIN_VALUE;
        for (int j : arr) {
            if (j >= first) {
                third = second;
                second = first;
                first = j;
            } else if (j >= second) {
                third = second;
                second = j;

            } else if (j >= third) {
                third = j;
            }
        }
		System.out.println(first +" " + second +" "+ third);
	}
}