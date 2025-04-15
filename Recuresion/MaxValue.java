public class MaxValue {
    static void PrintArr(int arr[], int i){
        if(i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        PrintArr(arr, i+1);
    }
    static int maxValue(int arr[] , int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int smallAns = maxValue(arr, i+1);
        return Math.max(arr[i], smallAns);
    }
    static int Sum(int arr[], int i){
        if(i==arr.length-1){
            return arr[i];
        }
        return Sum(arr, i+1)+arr[i];
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        PrintArr(arr, 0);
        System.out.println("max value is: "+maxValue(arr,  0));
        System.out.println(Sum(arr, 0));
    }
}
