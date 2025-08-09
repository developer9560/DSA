#include<stdio.h>
int main(){
    int arr[]= {4,0,7,4,0,6,3,0,8,0};
    int n = sizeof(arr)/sizeof(arr[0]);
    int j = 0;
    for(int i = 0; i<n;i++){
        if(arr[i]!=0){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            j++;
        }
    }
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);

        /* code */
    }
    
 
    return 0;
}