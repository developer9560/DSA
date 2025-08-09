#include<bits/stdc++.h>
using namespace std;
int main(){

    int arr[10];
    printf("your array is ");
    int size = sizeof(arr)/sizeof(arr[0]);
    for(int i = 0; i<size; i++){
        cout<<"Enter the number of at index :" << i;
        scanf("%d",&arr[i]);
    }
    for(int i = 0 ; i<size; i++){
        printf("%d ",arr[i]);
    }
    return 0;

}