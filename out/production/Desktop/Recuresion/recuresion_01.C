// simple recursion proble to princt hello word 5 times;



#include<bits/stdc++.h>
using namespace std;

void printnumb(int n){
    if(n==0){
        return ;}
        cout<<"hello word"<<endl;
        n--;
        printnumb(n);
}
int main(){
    printnumb(5);
    return 0;
}