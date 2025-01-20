#include <stdio.h>
#include <stdbool.h>

int n = 5;
int arr[n];
int top = -1;

void push(int x ){
    if(top == n-1){
        printf("stack overflow");
        return ;
    }
    top ++;
    arr[top] = x;
}

int pop(){
    if(top == -1){
        printf("underflow");
        return -1;
    }
    int temp = arr[top];
    top--;
    return temp;
}

bool isEmpty(){
  if (top == -1)
  {
    return true;
  }
  else false ;

  
}
bool isFull(){
    if(top == n-1){
        return true;
    }else{
        return false;
    }

}

int peek(){
    if (top== -1)
    {
        printf("underflow");
        return -1;
        /* code */
    }
    return arr[top];
    
}
int main(){

    push(12);
    push(34);
    push(23);
    

    


    return 0;
}
