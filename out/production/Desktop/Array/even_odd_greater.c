#include<stdio.h>
int main(){
     
     int arr[]= {3,5434,365,76,744,2,4,6,545,6,557,56,54,3};
     int count = sizeof(arr)/sizeof(arr[0]);

     for (int i = 0; i < count; i++)
     {
        if(i%2==0){
            if (arr[i]<arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]= temp;
                
            }
            
        }else{
            if(arr[i]>arr[i+1]){
                 int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]= temp;
            }
        }
        /* code */
        
     }

     for (int i = 0; i < count; i++)
     {
        printf("%d ", arr[i]);
     }
     
     
    return 0;
}