#include<stdio.h>
extern int a,b;
extern int x; //we cannot use x here because x is made static in main.c
void sub()
{
// x++;  //we cannot use x here because x is made static in main.c
a++;
int c;
c=a-b;
printf("sub is=%d\n",c);
}

