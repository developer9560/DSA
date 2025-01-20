#include<stdio.h>

int main(){
    
    int arr[]= {4,63,75,743,754,23,643};
    int first, second, third ;
    first= second= third=0;
    int n = sizeof(arr)/sizeof(arr[0]);

    if(n>3){ 

        for(int i = 0; i<n; i++){
            if(arr[i]>first){
                third= second;
                second =first;
                first = arr[i];
            }else if( arr[i]> second){
                third = second;
                second = arr[i];

            }else if (arr[i]> third){
                third =arr[i];
            }
        }

        printf("the three largest number is %d , %d, %d " , first ,second,third);

    }else{
        printf("array size is less than the number of variables that is 3");
    }

    return 0;
}