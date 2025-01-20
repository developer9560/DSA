public class sort_bubble {
    //funtion for print original array
    public static void print(int arr[]) {
        System.out.println("original array ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void printarr(int arr[]) {
        System.out.println("\n shorted array ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,5,3,7,4,7,6,2,9,1};
        print(arr);
        for(int i = 0; i< arr.length-1; i++){
            for(int j = 0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        printarr(arr);
        System.out.println("\nlargest element is ");
        System.out.println(arr[arr.length-1]);
        

    }
}
//https://www.geeksforgeeks.org/array-data-structure-guide/