import java.util.*;

public class revisionArrayCopy {
    
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 =  arr1; // by this line , it creates a reference to the same array , so any changes made to arr2 will reflect in arr1 (shallow copy)

        System.out.println("Original array:");
        printArray(arr1);
        System.out.println("Array 2 (reference to array 1):");
        printArray(arr2);
        System.out.println("Copied array:");
        printArray(arr2);

        // Modifying the array 2 
        arr2[0] = 10;
        arr2[1] = 20;
        System.out.println("array 1 After modifying array 2:");
        printArray(arr1);
        System.out.println("Array 2 after modification:");
        printArray(arr2);
        // To create a copy of the array, we can use the clone method (deep copy)
        int[] arr3 = arr1.clone(); // this creates a new array with the same elements as arr1
        System.out.println("Array 3 (copy of array 1):");
        printArray(arr3);
        // Modifying the array 3
        arr3[0] = 100;
        arr3[1] = 200;
        System.out.println("Array 1 after modifying array 3:");
        printArray(arr1);
        System.out.println("Array 3 after modification:");
        printArray(arr3);

        // To create a copy of the array using Arrays.copyOf method
        int[] arr4 = Arrays.copyOf(arr1, arr1.length); // this creates a new array with the same elements as arr1
        System.out.println("Array 4 (copy of array 1):");
        printArray(arr4);
        // Modifying the array 4
        arr4[0] = 1000;
        arr4[1] = 2000;
        System.out.println("Array 1 after modifying array 4:");
        printArray(arr1);
        System.out.println("Array 4 after modification:");
        printArray(arr4);
        

    }
}