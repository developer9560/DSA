# include <stdio.h>

int main (){

    int arr[]= {2,3,5,6,4,1};
    int value, position;
    int n = sizeof(arr)/ sizeof(arr[0]);
    // for print the array
    printf("original array\n");
    for( int i = 0 ; i<n-1; i++){
        printf("%d ", arr[i]);
    }
    printf("enter the number to delete");
    scanf("%d", &value);

    for(int i = 0 ; i<n-1; i++){
        if(arr[i]==value){
           for(int j = i; j< n-1; j++){
            arr[j]= arr[j+1];
           }
        
        }
    }
    printf("updated array");
     for( int i = 0 ; i<n-1; i++){
        printf("%d ", arr[i]);
    }

    return 0;
}