#include <stdio.h>

void display(int arr[], int n){
    for(int i =0 ;i<n ; i++){
        printf("%d ",arr[i]);
    }
}

int main(){
    int arr[10]= {2,4,3,5,7,6,8,9};
    int value , positon, size= 8;
    printf("original array\n");
    display(arr, 8);
    printf("enter the element to insert");
    scanf("%d", &value);
    printf("enter the position ");
    scanf("%d", &positon);

    for(int i = size-1; i>=positon; i--){
        arr[i+1]= arr[i];
    }
    arr[positon] = value;

    
    printf("new array");
    display(arr, size);




    return 0;
}