public class largest_3_number {

    public static void main(String[] args) {
        int arr[]= { 5,7,34,75,85,96};
        int first , second , third;
        first = second = third= 0;
        int size = arr.length;
        if (size > 3) {
            for(int i = 0; i<size; i++){
                if (arr[i]> first) {
                    third = second;
                    second = first;
                    first = arr[i];
                }else if (arr[i]> second) {
                    third = second;
                    second = arr[i];
                }else if (arr[i]>third) {
                    third = arr[i];
                }

            }
            System.out.println(" three largest number are :"+ first +" "+ second +  " "+third);
            
        }else{
            System.out.println("array lenght is less the array size");
        }
    }
    
}
