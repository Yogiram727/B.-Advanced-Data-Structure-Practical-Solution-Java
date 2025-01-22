#include <stdio.h>
int main()
{
    char ch[100]; // Character array with size 100
    printf("Enter your full name: ");
    gets(ch);
    printf("\nHello ");
    puts(ch);
    return 0;
}