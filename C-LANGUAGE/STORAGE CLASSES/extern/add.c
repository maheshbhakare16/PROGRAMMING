#include<stdio.h>
extern int a,b;
/*static*/ void add() //we cannot use static function outside this file 
{
int c;
c=a+b;
printf("add is=%d\n",c);

}

