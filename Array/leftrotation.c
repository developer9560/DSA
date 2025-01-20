#include <stdio.h>

void printarr(int arr[], int n){
    for (int i = 0; i < n; i++)
    {
       printf("%d ", arr[i]);
    }
    
}
//d - number of positions
//left rotations
void rotation(int arr[], int d, int n ){


    for (int i = 0; i < d; i++)
    {
        int first = arr[0];
        for (int j = 0; j < n-1; j++)
        {
           arr[j] = arr[j+1];

        }
        arr[n-1]= first;
        
    }
    
}
 int main () {
     int arr[] = {1,3,5,7,9,2,4,6,8,0};
     int n = sizeof(arr)/sizeof(arr[0]);
     int d;
     printf("original array\n");
     printarr(arr,n);

     printf("\n enter the number of position to rotate less than 10\n");
     scanf("%d",&d);
     rotation(arr,d,n);
     printf("after rotation\n");
     printarr(arr,n);



 return 0 ;
}