# include <stdio.h>
int main (){
    
    int arr[]={1,2,3,4,5,6,7,8,9,0};
    int n = sizeof(arr)/sizeof(arr[0]);
    int low = 0;
    int high = n-1;
    int key = 9;
     while (low<= high)
     {
        int mid = low + (high - low)/ 2;
        if(arr[mid]== key){
            printf("the element is found at index : %d", mid);
            break;
        }
        else if ( arr[mid] < key ){
            low = mid + 1;
         }else{
            high = mid-1;
         }
     }
    return 0;
}