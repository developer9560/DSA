#include<bits/stdc++.h>
using namespace std;

int main(){
    int arr[] = {23,24,53,432,352,323,234,45434,432,3223,52};
    int max = arr[0];
    int size = sizeof(arr)/sizeof(arr[0]);
    for(int i = 0; i<size ;i++){
        if(arr[i]>max){
            max= arr[i];
        }
    }
    cout<<"maximum number is :"<< max ;
   

    return 0;
}