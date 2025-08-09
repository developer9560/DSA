#include<stdio.h>
int main(){
    int arr[] ={2,3,4,5,6,7,8};
    int size = sizeof(arr)/sizeof(arr[0]);
    int target = 10;
    for(int i = 0;i<size; i++){
        for(int j = i+1; j<size; j++){
            if(target == arr[i]+arr[j]){ 
                printf("\ntarget exists %d and %d", arr[i] , arr[j]);
            }
        }
    }
    return 0;
}