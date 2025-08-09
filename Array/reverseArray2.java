package Array;

public class reverseArray2 {
    static void printArray(int[] arr){
        for(int a : arr){
            System.out.print(a +" ");
        }
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6,7,8,9,10,11};
        int[] ansArr = new int[arr.length];
        System.out.println("reversed array using ansArr ");
        for(int i = 0; i<arr.length ;i++){
            ansArr[i] = arr[arr.length-1-i];
        }
        printArray(ansArr);

        System.out.println("\nin place reversed of same array using for loop without using extra pointer");
        for(int i = 0 ; i<arr.length/2; i++){
            int temp = arr[i];

            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        printArray(arr);

        System.out.println("\n in place revers using while loop using two pinters");
        int i = 0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println();
        printArray(arr);

    }

}
