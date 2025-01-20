#include <stdio.h>
#include <string.h>
 int main () {
    struct student// user define data 
    {
        int age; 
        float percentage;
        char  name;
    };
    struct student s1;
    s1.age = 20;
    s1.name = 's';
    s1.percentage = 93.5;

    struct student s2;
    s2.age = 32;
    s2.name = 'r';
    s2.percentage= 594.6;
    printf("%d\n",s1.age);
    
 return 0 ;
}
