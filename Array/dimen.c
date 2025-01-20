#include<stdio.h>
int main(){


    for(int i = 1 ; i<=500; i++){
        int size = i*0.75;
        printf("<dimen name='text_size_%dsp'>%dsp</dimen>\n" , i , size);
        printf("<dimen name='size_%ddp'>%ddp</dimen>\n" , i , size);

    }

    return 0;
}