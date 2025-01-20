#include <stdio.h>
#include <stdlib.h>
struct stack_ds
{
    int *arr;
    int top;
    int size;
    int cap;

};

typedef struct stack_ds stk;

stk* creat_stack(int capacity ){
    stk *p = (stk*)malloc(sizeof(stk));
    if(p== NULL){
        return NULL;
    }
    p->top = -1;
    p->size=0;
    p->cap=capacity;
    p->arr=(int*)malloc(capacity*sizeof(int));
    if (p-> arr==NULL){
        return NULL;
    }
}

int main(){
    stk *s1 = creat_stack(10);

    return 0;
}
