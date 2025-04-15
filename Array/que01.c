#include<stdio.h>
#include <stdbool.h>

int main(){
    int n , target ;
    bool flag = true;
    printf("enter the size of arrya:");
    scanf("%d",&n);

    int arr[n];
    for(int i = 0; i<n; i++){
        printf("Enter the value of%d :", i+1);
        scanf("%d"  , &arr[i]);
    }
    for(int i = 0; i<n; i++){
        printf("%d ", arr[i]);
    }

    printf("\n Enter the target number: ");
    scanf("%d", &target);

    for(int i = 0; i<n; i++){

        for(int j=i+1; j<n; j++){
            if(arr[i]+arr[j]==target){
                printf("%d %d", arr[i], arr[j]);
                flag = false;
        }

    }
  if(flag ==true){
    printf('no data found');
  }
    return 0;
}
}
